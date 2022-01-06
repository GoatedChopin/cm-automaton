# cm-automaton
cm-automaton is a simple app built using Google's Gmail API to send emails.

**SETUP**
Before running this application, the user must first:

1. create a project on Google Cloud and enable the Gmail API on said project
2. download the credentials file from the Google Cloud project and rename the file "*credentials.json*"
3. place this file in the working directory of their application
4. authorize the email address they wish to send emails from in their project on Google Cloud

After completing these four steps, The application should be capable of sending emails to anyone from the email address authorized in Google Cloud.

Note that the AutomatonStringBuilder class is customized with my own personalized email signature. Be sure to change it before sending emails of your own with your application.

**Common Problems**
If the program repeatedly throws errors citing insufficient authorization, the problem may be that the scopes were changed. If you change the scopes in Application.java, you must also *delete the tokens folder*.
