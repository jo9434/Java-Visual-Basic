''This Code is Written by Joel Allan William on 21/12/2021 at 9:32 AM IST.
'It can be used for references and understanding my logic, but please do avoid plagarising (copying it, removing my comments and saying you have written it lol B) ) 
'this written code.
'And, if you want to understand this code try it yourself and work on it on your own and feel free to explore more on this basic written code...
'And, I will be explaining the logic behind the Timers which we use in many programming languages like Java, VB. NET, C#... etc.. and also placing the screenshot for the
'respective outputs.

'VB.NET Code for Timers
'in the other file will be writing this complete code to do and explain the same approach in .vb and .cs programs
'so that you can know it is all the same but the way certain methods are generated are different..

'Public Class UserLogin // UserLogin.vb or UserLogin.cs
  'Private Sub CmdLogin_Load(sender As Object, e As EventArgs) Handles CmdLogin.Click
    'Timer1.Start() // in the Java Code below we will explain what a Timer can do without using events and Timer in java
    'back-end(computing calculations) and front-end(UI/UX Design in simple terms what the end user sees), 
  'End Sub
'End Class

' ***** Code Starts Here ***** '

Public Class UserLogin
  Dim msgLoginSuccess, msgLoginFail As String
  ' CmdLogin is the button in the form UserLogin Form which I have designed...
  
  Private Sub CmdLogin_Load(sender As Object, e As EventArgs) Handles CmdLogin.Load
    Timer1.Start()
  End Sub
  
  Private Sub CmdLogin_Click(sender As Object, e As EventArgs) Handles CmdLogin.Click
    msgLoginSuccess = "Login Successful..!"
    msgLoginFail = "Login Failed...! Please Try Again....!"
    
    If TxtUsername.Text = "User1" And TxtPassword.Text = "User1867#" Then
      MsgBox(msgLoginSuccess)
      UserHome.Show()
      Close() 'Me.Close() or Close() - will close the current active form i.e., UserLogin.vb form and open UserHome.vb form
    Else If TxtUsername.Text IsNot "User1" And TxtPassword.Text IsNot "User1867#" Then
        MsgBox(msgLoginFail)
        Application.Exit() ' closes the app
    End If
  End Sub
End Class
