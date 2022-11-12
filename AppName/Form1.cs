namespace AppName
{
    public partial class LoginForm : Form
    {
        private readonly string unamecheck = "joel7482", pwdcheck = "joel7482#";

        public LoginForm()
        {
            InitializeComponent();
        }

        private void CmdExit_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void CmdLogin_Click(object sender, EventArgs e)
        {
            if (TBUsername.Text.Equals(unamecheck) && TBPassword.Text.Equals(pwdcheck)) {
                MessageBox.Show("Login Successful...!");
            } else {
                MessageBox.Show("Login Unsuccessful...!");
                Close();
            }
        }
    }
}