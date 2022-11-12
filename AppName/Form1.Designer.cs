namespace AppName
{
    partial class LoginForm
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.LBLUsername = new System.Windows.Forms.Label();
            this.LBLPassword = new System.Windows.Forms.Label();
            this.TBUsername = new System.Windows.Forms.TextBox();
            this.TBPassword = new System.Windows.Forms.TextBox();
            this.CmdLogin = new System.Windows.Forms.Button();
            this.CmdExit = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // LBLUsername
            // 
            this.LBLUsername.AutoSize = true;
            this.LBLUsername.Location = new System.Drawing.Point(26, 38);
            this.LBLUsername.Name = "LBLUsername";
            this.LBLUsername.Size = new System.Drawing.Size(91, 25);
            this.LBLUsername.TabIndex = 0;
            this.LBLUsername.Text = "Username";
            // 
            // LBLPassword
            // 
            this.LBLPassword.AutoSize = true;
            this.LBLPassword.Location = new System.Drawing.Point(26, 85);
            this.LBLPassword.Name = "LBLPassword";
            this.LBLPassword.Size = new System.Drawing.Size(87, 25);
            this.LBLPassword.TabIndex = 1;
            this.LBLPassword.Text = "Password";
            // 
            // TBUsername
            // 
            this.TBUsername.Location = new System.Drawing.Point(123, 35);
            this.TBUsername.MaxLength = 20;
            this.TBUsername.Name = "TBUsername";
            this.TBUsername.Size = new System.Drawing.Size(211, 31);
            this.TBUsername.TabIndex = 2;
            // 
            // TBPassword
            // 
            this.TBPassword.Location = new System.Drawing.Point(123, 82);
            this.TBPassword.MaxLength = 20;
            this.TBPassword.Name = "TBPassword";
            this.TBPassword.PasswordChar = '*';
            this.TBPassword.Size = new System.Drawing.Size(211, 31);
            this.TBPassword.TabIndex = 3;
            // 
            // CmdLogin
            // 
            this.CmdLogin.Location = new System.Drawing.Point(84, 142);
            this.CmdLogin.Name = "CmdLogin";
            this.CmdLogin.Size = new System.Drawing.Size(108, 42);
            this.CmdLogin.TabIndex = 4;
            this.CmdLogin.Text = "Login";
            this.CmdLogin.UseVisualStyleBackColor = true;
            this.CmdLogin.Click += new System.EventHandler(this.CmdLogin_Click);
            // 
            // CmdExit
            // 
            this.CmdExit.Location = new System.Drawing.Point(198, 142);
            this.CmdExit.Name = "CmdExit";
            this.CmdExit.Size = new System.Drawing.Size(108, 42);
            this.CmdExit.TabIndex = 5;
            this.CmdExit.Text = "Exit";
            this.CmdExit.UseVisualStyleBackColor = true;
            this.CmdExit.Click += new System.EventHandler(this.CmdExit_Click);
            // 
            // LoginForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 25F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(381, 207);
            this.Controls.Add(this.CmdExit);
            this.Controls.Add(this.CmdLogin);
            this.Controls.Add(this.TBPassword);
            this.Controls.Add(this.TBUsername);
            this.Controls.Add(this.LBLPassword);
            this.Controls.Add(this.LBLUsername);
            this.Name = "LoginForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Login";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private Label LBLUsername;
        private Label LBLPassword;
        private TextBox TBUsername;
        private TextBox TBPassword;
        private Button CmdLogin;
        private Button CmdExit;
    }
}