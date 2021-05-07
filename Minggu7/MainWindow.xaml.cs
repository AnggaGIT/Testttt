using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using Oracle.DataAccess.Client;


namespace Minggu7
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        OracleConnection conn;
        string connectionString;
        Window1 w1;
        public MainWindow()
        {
            InitializeComponent();
        }

        private void BtnLogin_Click(object sender, RoutedEventArgs e)
        {
            if (textDS.Text == "" || textUsername.Text == "" || textPassword.Text == "")
            {
                MessageBox.Show("Terdapat field yang belum diisi");
            }
            else
            {
                connectionString = "Data Source = " + textDS.Text + "; User ID=" + textUsername.Text + "; Password=" + textPassword.Text;
                conn = new OracleConnection(connectionString);
                try
                {
                    conn.Open();
                    w1 = new Window1(conn);
                    w1.ShowDialog();
                    conn.Close();
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Terdapat input yang salah");
                    conn.Close();
                }
            }
        }
    }
}
