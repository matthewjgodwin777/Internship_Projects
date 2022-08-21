import pandas as pd
import math
import os
def sheetValid(sheetn): #to check if the sheet has valid contents that can be converted into a verilog file
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
        print('Invalid path given! Please check if a valid excel file is present in that path.')
        exit()
    try:
        for x in doc:
            pos,desp,portp,direcp=sheetValid(doc[x])
            invar=[]
            outvar=[]
            inoutvar=[]
            if len(pos)==0:
                print('Unable to detect required table of values in sheet ',x+1)
                continue
            pos=min(pos)
            if(pos<len(doc[x])-1 and pos!=-2):
                desvar=doc[x][desp][pos+1]
            if pos!=-2:                                     
                for i in range(pos+1,len(doc[x])):      #To find and store variables in lists
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
            if destpath!='': #If destination folder path is given, i.e, not left blank
                fl=open(destpath.rstrip('/\\')+'/'+path[slashpos+1:dotpos]+'_s'+str(x+1)+'.v','w')
                temppaths.append(destpath.rstrip('/\\')+'/'+path[slashpos+1:dotpos]+'_s'+str(x+1)+'.v')
            else: #if destination folder path is not given, store in same folder as excel file
                fl=open(path[0:dotpos]+'_s'+str(x+1)+'.v','w')
                temppaths.append(path[0:dotpos]+'_s'+str(x+1)+'.v')
            fl.write('module '+path[slashpos+1:dotpos]+'_s'+str(x+1)+';\n')
            if len(invar)>0:
                for j in range(int(math.ceil(len(invar)/5))):
                    reginp='\nreg '+invar[5*j]
                    for i in range(5*j+1,5*j+5):
                        if i>=len(invar):
                            break
                        reginp=reginp+', '+invar[i]
                    reginp=reginp+';\n'
                    fl.write(reginp)
            if len(outvar)>0:
                for j in range(int(math.ceil(len(outvar)/5))):
                    wireout='\nwire '+outvar[5*j]
                    for i in range(5*j+1,5*j+5):
                        if i>=len(outvar):
                            break
                        wireout=wireout+', '+outvar[i]
                    wireout=wireout+';\n'
                    fl.write(wireout)
            if len(inoutvar)>0:
                for j in range(int(math.ceil(len(inoutvar)/5))):
                    inout='\ninout '+inoutvar[5*j]                  #if the keyword 'inout' is not the correct keyword, just replace that word alone with the correct keyword in the string
                    for i in range(5*j+1,5*j+5):
                        if i>=len(inoutvar):
                            break
                        inout=inout+', '+inoutvar[i]
                    inout=inout+';\n'
                    fl.write(inout)
            if desp!=-1 and pos!=-2 and len(invar)+len(outvar)+len(inoutvar)>=1:
                des=doc[x][desp][pos+1]+' DUT ('
                first=True
                for i in invar:
                        if not first:
                            des=des+',\n      '+(' '*len(doc[x][desp][pos+1]))
                        else:
                            first=False
                        des=des+'.'+i+'('+i+')'
                for i in outvar:
                        if not first:
                            des=des+',\n      '+(' '*len(doc[x][desp][pos+1]))
                        else:
                            first=False
                        des=des+'.'+i+'('+i+')'
                for i in inoutvar:
                        if not first:
                            des=des+',\n      '+(' '*len(doc[x][desp][pos+1]))
                        else:
                            first=False
                        des=des+'.'+i+'('+i+')'
                des =des+');\n'
                fl.write('\n'+des)
            fl.write('\nendmodule')
            fl.close()
            print('Table in Sheet '+str(x+1)+' is converted to verilog successfully.')
    except: #To delete the partially converted files which were interrupted due to error
        print('ERROR: The Excel Sheet(s) in context is not in the accepted Format!')
        for pth in temppaths:
            if os.path.exists(pth):
                os.remove(pth)
excpath=input('Enter Path to Excel Sheet: ')
destpath=input('Enter Destination Folder Path: ') #If no input is given, The Default folder will be the same as the input file / excel file.
excpath=excpath.replace('\\','/')
destpath=destpath.replace('\\','/')
compute(excpath,destpath)
