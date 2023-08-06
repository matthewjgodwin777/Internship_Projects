# Points To Note: - (Please read README.txt for a bigger description about this project)
# 1. This code imports the necessary modules and libraries for a Flask web application that will render templates using OpenAI and accept user input through HTML forms.
# 2. No OpenAI API key is revealed in this code. To use this code anywhere else, use your API key inplace of mine.

import openai

import os

from flask import Flask, render_template_string, request

#This line of code should be modified to include your own OPENAI API key for your purposes
openai.api_key = os.environ['OPENAI_API_KEY']


def generateText(components):

  response = openai.ChatCompletion.create(
    model="gpt-3.5-turbo",
    messages=[{
      "role": "system",
      "content": "You are a helpful assistant"
    }, {
      "role":
      "user",
      "content":
      'The below text/paragraph is a description of a person\'s lifestyle. Using this information about them, give a list of suggestions of workout equipement / devices to buy along with routine to follow. Ensure the answer (in points) gives the workouts required to do and equipments required. Generate a link for each equipment mentioned next to it in the format :  <a href="https://www.decathlon.in/search?query={name_of_equipment}">{name_of_equipment}</a> : - '
      + components
    }])

  return response['choices'][0]['message']['content']


# Creating a Flask web application object named app and define a route for the root URL that responds to GET and POST requests
app = Flask(__name__)


@app.route('/', methods=['GET', 'POST'])
def hello():

  output = ""

  if request.method == 'POST':

    components = request.form['components']

    output = generateText(components)

  # This is a HTML template for FitAdvisor, a website which takes in details of a person's lifestyle, body and workout goals,etc., to generate a workout plan and suggest equipment required.
  return render_template_string('''
<!DOCTYPE html>
<html>

<head>
  <title>FitAdvisor: Your Personalized Workout Instructor</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="icon" href="https://www.decathlon.in/static/icons/icon-512x512.png">
  <style>
    #mainheader {
      border-bottom: 3px solid black;
      padding-top: 10px;
      padding-bottom: 10px;
      color: white;
      background-color:#0079cc;
      padding: 2%;
      border-radius:5px;
    }
    footer{
    text-align:right;
    }
    .container {
      margin-top: 30px;
    }

    .card {
      margin-top: 20px;
      height:200px;
    }
    #divcol{
      background-color:white;
      padding:10px;
      margin-top: -7px;
      border-radius: 3px;
      border-left: 1px solid black;
      border-right: 1px solid black;
      border-bottom: 1px solid black;
    }
    #logo{
    position:relative;
    margin-left:17%;
    border:1px solid white;
    width:15%;
    }
    body{
    background-color:#9fdfff;
    }
    #loadinggif img{
    height:20px;
    width:20px;
    }
  </style>

  <script>
    async function generateText() {
      document.getElementsByClassName('card')[0].style.height='auto';
      const components = document.querySelector('#components').value;
      const output = document.querySelector('#output');
      output.innerHTML = `Fetching your own customised workout plan, equipment and other details in a moment...`;
      document.getElementById('loadinggif').innerHTML=`<img src='https://media.tenor.com/wpSo-8CrXqUAAAAj/loading-loading-forever.gif'/>`;

      const response = await fetch('/generate', {
        method: 'POST',
        body: new FormData(document.querySelector('#advisor-form'))
      });

      const newOutput = await response.text();
      document.getElementById('loadinggif').innerHTML=``;
      output.innerHTML = newOutput;
      output.innerHTML +=`<br>To purchase any equipment, visit <a href='https://www.decathlon.in/'>decathlon.in</a> for quality products and exclusive deals on sports gear and equipment.`; 
    }

    function copyToClipboard() {
      const output = document.querySelector('#output');
      const textarea = document.createElement('textarea');
      textarea.value = output.textContent;
      document.body.appendChild(textarea);
      textarea.select();
      document.execCommand('copy');
      document.body.removeChild(textarea);
      alert('Copied to clipboard');
    }
  </script>

</head>

<body>
  <div class="container">
    <h3 id="mainheader"><i>FitAdvisor: Your Personalized Workout Instructor</i><img src='https://cdncontent.decathlon.in/_next/static/images/logo-93d12d8cff484ab736d2a39f15bf66d8.svg' id='logo'/></h3>
    <div id='divcol'>
    <form id="advisor-form" onsubmit="event.preventDefault(); generateText();" class="mb-3">
      <div class="mb-3">
        <label for="components" class="form-label"><b><i>Description:</i></b></label>
        <input type="text" class="form-control" id="components" name="components"
          placeholder="Enter a brief summary of your lifestyle and description of your body, along with your workout goals."
          required>
      </div>
      <button type="submit" class="btn btn-primary">Generate</button>&nbsp;&nbsp;<span id='loadinggif'></span>
    </form>

    <div class="card">
      <div class="card-header d-flex justify-content-between align-items-center">
        Output:
        <button class="btn btn-secondary btn-sm" onclick="copyToClipboard()">Copy</button>
      </div>
      <div class="card-body">
        <pre id="output" class="mb-0" style="white-space: pre-wrap;">This is the output screen. If you want an example to try out, type the text below in the above input field:<br><br>I am 183 cm in height and 95 kgs in weight. I want to tone my muscles, increase flexibility, and reduce weight.<br>I have a slightly sedentary lifestyle.</pre>
      </div>
    </div><br>
<footer><i>
<small>Copyright © 2023 Decathlon</small>
</i></footer>
   </div>
  </div>
</body>

</html>
 ''',
                                output=output)


@app.route('/generate', methods=['POST'])
def generate():

  components = request.form['components']

  return generateText(components)


if __name__ == '__main__':

  app.run(host='0.0.0.0', port=8080)

# This Full Stack Application was developed by Matthew Jonathan G
