# reg shouldn not have more than 5 variables in 1 line
# inout datatype should be there just like reg and wire
# design name .(.....) should each be in different lines
import pandas as pd
import os
from tkinter import messagebox
from tkinter import *
import tkinter as tk
master = tk.Tk()
def sheetValid(sheetn):
    valid=True
    direc=[]
    des=[]
    port=[]
    direc_col=-1
    des_col=-1
    port_col=-1
    sheetn=sheetn.fillna('NAN')
    ch=0
    for x in sheetn:
        if x.lower().find('design')!=-1:
           des.append(-1)
           des_col=x
        elif x.lower().find('port')!=-1:
           port.append(-1)
           port_col=x
        elif x.lower().find('direc')!=-1:
           direc.append(-1)
           direc_col=x
        c=0
        for i in sheetn[x]:
            i=str(i)
            if i!='NAN':
                if i.lower().find('design')!=-1:
                    des.append(c)
                    des_col=x
                elif i.lower().find('port')!=-1:
                    port.append(c)
                    port_col=x
                elif i.lower().find('direc')!=-1:
                    direc.append(c)
                    direc_col=x
            c+=1
        ch+=1
    return list(set(des).union(port,direc)),des_col,port_col,direc_col
temppaths=[]
def compute(path,destpath):
    try:
        sheet_count = len(pd.ExcelFile(path).sheet_names)
        doc = pd.read_excel(path,sheet_name=list(range(sheet_count)))
    except:
        messagebox.showinfo('Invalid path given','Please check if a valid excel file is present in that path.')
        master.destroy()
        exit()
    try:
        for x in doc:
            pos,desp,portp,direcp=sheetValid(doc[x])
            invar=[]
            outvar=[]
            inoutvar=[]
            if len(pos)==0:
                messagebox.showinfo('Invalid Values in Sheet','Unable to detect required table of values in sheet '+str(x+1))
                continue
            pos=min(pos)
            #print('Required Table Of Values Detected in Sheet ',x+1)
            if(pos<len(doc[x])-1 and pos!=-2):
                desvar=doc[x][desp][pos+1]
            if pos!=-2:
                for i in range(pos+1,len(doc[x])):
                    if doc[x][direcp][i].lower().find('in')!=-1 and doc[x][direcp][i].lower().find('out')!=-1:
                        inoutvar.append(doc[x][portp][i])
                    elif doc[x][direcp][i].lower().find('out')!=-1:
                        outvar.append(doc[x][portp][i])
                    elif doc[x][direcp][i].lower().find('inp')!=-1:
                        invar.append(doc[x][portp][i])
            dotpos=path[::-1].find('.')
            if dotpos!=-1:
                dotpos=len(path)-1-dotpos
            else:
                dotpos=len(path)
            slashpos=max(path[::-1].find('\\'),path[::-1].find('/'))
            if slashpos!=-1:
                slashpos=len(path)-1-slashpos
            else:
                slashpos=len(path)
            if destpath!='':
                fl=open(destpath.rstrip('/\\')+'/'+path[slashpos+1:dotpos]+'_s'+str(x+1)+'.v','w')
                temppaths.append(destpath.rstrip('/\\')+'/'+path[slashpos+1:dotpos]+'_s'+str(x+1)+'.v')
            else:
                fl=open(path[0:dotpos]+'_s'+str(x+1)+'.v','w')
                temppaths.append(path[0:dotpos]+'_s'+str(x+1)+'.v')
            fl.write('module '+path[slashpos+1:dotpos]+'_s'+str(x+1)+';\n\n')
            if len(invar)>0:
                reginp='reg '+invar[0]
                for i in range(1,len(invar)):
                    reginp=reginp+', '+invar[i]
                fl.write(reginp+';\n')
            if len(outvar)>0:
                wireout='\nwire '+outvar[0]
                for i in range(1,len(outvar)):
                    wireout=wireout+', '+outvar[i]
                fl.write(wireout+';\n')
            if len(inoutvar)>0:
                inout='\ninout '+inoutvar[0]
                for i in range(1,len(inoutvar)):
                    inout=inout+', '+inoutvar[i]
                fl.write(inout+';\n')
            if desp!=-1 and pos!=-2 and len(invar)+len(outvar)+len(inoutvar)>=1:
                des=doc[x][desp][pos+1]+' DUT ('
                first=True
                for i in invar:
                        if not first:
                            des=des+', '
                        else:
                            first=False
                        des=des+'.'+i+'('+i+')'
                for i in outvar:
                        if not first:
                            des=des+', '
                        else:
                            first=False
                        des=des+'.'+i+'('+i+')'
                for i in inoutvar:
                        if not first:
                            des=des+', '
                        else:
                            first=False
                        des=des+'.'+i+'('+i+')'
                des =des+');\n'
                fl.write('\n'+des)
            fl.write('\nendmodule')
            fl.close()
            messagebox.showinfo("Success!",'Table in Sheet '+str(x+1)+' is converted to verilog successfully.')
    except:
        messagebox.showinfo('ERROR','The Excel Sheet(s) in context is not in the accepted Format!')
        for pth in temppaths:
            if os.path.exists(pth):
                os.remove(pth)
    master.destroy()
tk.Label(master, text='Excel To Code Converter').grid(row=0,column=1)
tk.Label(master, text='Excel File Path').grid(row=1)
tk.Label(master, text='Destination File Path').grid(row=2)
e1 = tk.Entry(master)
e2 = tk.Entry(master)
e1.grid(row=1, column=1)
e2.grid(row=2, column=1)
master.geometry("700x350")
try:
    redbutton = tk.Button(master, text = 'Extract',command=lambda:compute(e1.get().replace('\\','/'),e2.get().replace('\\','/')).pack(pady=20))
    redbutton.grid(row=3,column=1)
    rw,cl = master.grid_size()
    tk.mainloop()
except:
    exit()
