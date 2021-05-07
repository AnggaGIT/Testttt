using System;
using System.Collections.Generic;
using System.Data;
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
using System.Windows.Shapes;
using Oracle.DataAccess.Client;

namespace Minggu7
{
    /// <summary>
    /// Interaction logic for Window1.xaml
    /// </summary>
    public partial class Window1 : Window
    {
        OracleConnection conn;
        public Window1(OracleConnection con)
        {
            InitializeComponent();
            conn = con;
        }

        private void BtnCari_Click(object sender, RoutedEventArgs e)
        {

        }

        private void BtnCari_Click_1(object sender, RoutedEventArgs e)
        {
            if(txtCari.Text == "")
            {
                MessageBox.Show("Nama tidak boleh kosong");
            }
            else
            {
                CrystalReport1 rpt = new CrystalReport1();// inisialisasi Report kalian 
                rpt.SetParameterValue("search", txtCari.Text);// ini buat lempar parameter ke report
                reportViewer.ViewerCore.ReportSource = rpt;// pasang report ke viewer
            }
            
        }
    }
}
