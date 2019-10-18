package swingui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bll.BookRatingsManager;
import bll.BooksManager;
import bll.UsersManager;
import dalconcrete.BookRatingsRepositoryMySql;
import dalconcrete.BooksRepositoryMysql;
import dalconcrete.UsersRepositoryMysql;
import entities.BookRatings;
import entities.Books;
import entities.Users;
import interfaces.IBookRatings;
import interfaces.IBooks;
import interfaces.IUsers;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import java.awt.Dimension;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class YeniUyePaneli extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtLocation;
	private JTextField txtAge;
	private JTable table;
	IBooks books = new BooksManager(new BooksRepositoryMysql());
	IUsers users = new UsersManager(new UsersRepositoryMysql());
	IBookRatings bookRatings = new BookRatingsManager(new BookRatingsRepositoryMySql());
	private JTextField txtISBN1;
	private JTextField txtISBN2;
	private JTextField txtISBN3;
	private JTextField txtISBN4;
	private JTextField txtISBN5;
	private JTextField txtISBN6;
	private JTextField txtISBN7;
	private JTextField txtISBN8;
	private JTextField txtISBN9;
	private JTextField txtISBN10;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	private JComboBox comboBox_2;

	private JComboBox comboBox_3;

	private JComboBox comboBox_4;

	private JComboBox comboBox_5;

	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;

	private JLabel lblUserID;// Burada user-id otomatik gosterilsin.
	private String a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			// com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Green",
			// Constants.LAF_ACRYL :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

			// Constants.LAF_AERO :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

			// Constants.LAF_ALUMINIUM :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

			// Constants.LAF_BERNSTEIN :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

			// Constants.LAF_FAST :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");

			// Constants.LAF_GRAPHITE :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

			// Constants.LAF_HIFI :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

			// Constants.LAF_LUNA :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");

			// Constants.LAF_MCWIN :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

			// Constants.LAF_MINT :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");

			// Constants.LAF_NOIRE :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");

			// Constants.LAF_SMART :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");

			// Constants.LAF_TEXTURE :
			// UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

			YeniUyePaneli dialog = new YeniUyePaneli();
			dialog.setLocationRelativeTo(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public YeniUyePaneli() {
		setTitle("Yeni \u00DCye Paneli");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 774);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(0, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblResim = new JLabel(" ");
		lblResim.setIcon(new ImageIcon(this.getClass().getResource("/kayitol.png")));
		lblResim.setBounds(10, 11, 263, 249);
		contentPane.add(lblResim);

		JLabel lblUserd = new JLabel("USER-ID");
		lblUserd.setBounds(283, 93, 80, 14);
		contentPane.add(lblUserd);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(283, 118, 80, 14);
		contentPane.add(lblPassword);

		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(283, 143, 80, 14);
		contentPane.add(lblLocation);

		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(283, 168, 80, 14);
		contentPane.add(lblAge);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(373, 112, 86, 20);
		contentPane.add(txtPassword);

		txtLocation = new JTextField();
		txtLocation.setColumns(10);
		txtLocation.setBounds(373, 137, 86, 20);
		contentPane.add(txtLocation);

		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(373, 162, 86, 20);
		contentPane.add(txtAge);

		JButton btnKayitOl = new JButton("Kay\u0131t Ol");
		btnKayitOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					if (txtISBN1.equals("") || txtISBN2.equals("") || txtISBN3.equals("") || txtISBN4.equals("")
							|| txtISBN5.equals("") || txtISBN6.equals("") || txtISBN7.equals("") || txtISBN8.equals("")
							|| txtISBN9.equals("") || txtISBN10.equals("")) {
						JOptionPane.showMessageDialog(null, "ISBN Bos birakilamaz!", "UYARI",
								JOptionPane.WARNING_MESSAGE);
						return;
					} else if (txtAge.equals("") || txtLocation.equals("")|| txtPassword.equals("")) {
						JOptionPane.showMessageDialog(null, "Bos alan birakmayiniz!", "UYARI",
								JOptionPane.WARNING_MESSAGE);
						return;
					}
					
					else {
						// kayit islemleri burada yapilsin.
						Users u = new Users();
						BookRatings br = new BookRatings();
						u.setUser_id(Integer.toString(users.UserID()));
						u.setLocation(txtLocation.getText());
						u.setAge(txtAge.getText());
						u.setPassword(txtPassword.getText());
						JTextField fields[] = { txtISBN1, txtISBN2, txtISBN3, txtISBN4, txtISBN5, txtISBN6, txtISBN7,
								txtISBN8, txtISBN9, txtISBN10 };
						JComboBox[] petList = { comboBox, comboBox_1, comboBox_2, comboBox_3, comboBox_4, comboBox_5,
								comboBox_6, comboBox_7, comboBox_8, comboBox_9 };
						for (int i = 0; i < 10; i++) {
							br.setUser_id(Integer.toString(users.UserID()));
							br.setIsbn(fields[i].getText());
							br.setBook_rating(petList[i].getSelectedItem().toString());

						}

						boolean sonuc = users.UyeOlma(u);
						if (sonuc)
							JOptionPane.showMessageDialog(null, "Uye kaydi basarilidir.");
						else
							JOptionPane.showMessageDialog(null, "Uye olma islemi basarisiz.");
					}

				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Hata:" + e.getMessage());
				}

			}
		});
		btnKayitOl.setBounds(340, 701, 89, 23);
		contentPane.add(btnKayitOl);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 297, 311, 389);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		txtISBN1 = new JTextField();
		txtISBN1.setColumns(10);
		txtISBN1.setBounds(373, 342, 86, 20);
		contentPane.add(txtISBN1);

		txtISBN2 = new JTextField();
		txtISBN2.setColumns(10);
		txtISBN2.setBounds(373, 373, 86, 20);
		contentPane.add(txtISBN2);

		txtISBN3 = new JTextField();
		txtISBN3.setColumns(10);
		txtISBN3.setBounds(373, 404, 86, 20);
		contentPane.add(txtISBN3);

		txtISBN4 = new JTextField();
		txtISBN4.setColumns(10);
		txtISBN4.setBounds(373, 435, 86, 20);
		contentPane.add(txtISBN4);

		txtISBN5 = new JTextField();
		txtISBN5.setColumns(10);
		txtISBN5.setBounds(373, 466, 86, 20);
		contentPane.add(txtISBN5);

		txtISBN6 = new JTextField();
		txtISBN6.setColumns(10);
		txtISBN6.setBounds(373, 497, 86, 20);
		contentPane.add(txtISBN6);

		txtISBN7 = new JTextField();
		txtISBN7.setColumns(10);
		txtISBN7.setBounds(373, 528, 86, 20);
		contentPane.add(txtISBN7);

		txtISBN8 = new JTextField();
		txtISBN8.setColumns(10);
		txtISBN8.setBounds(373, 559, 86, 20);
		contentPane.add(txtISBN8);

		txtISBN9 = new JTextField();
		txtISBN9.setColumns(10);
		txtISBN9.setBounds(373, 590, 86, 20);
		contentPane.add(txtISBN9);

		txtISBN10 = new JTextField();
		txtISBN10.setColumns(10);
		txtISBN10.setBounds(373, 621, 86, 20);
		contentPane.add(txtISBN10);

		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIsbn.setBounds(396, 317, 46, 14);
		contentPane.add(lblIsbn);

		JLabel lblPuan = new JLabel("Puan");
		lblPuan.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPuan.setBounds(491, 317, 46, 14);
		contentPane.add(lblPuan);

		JLabel lblKayitIslemi = new JLabel(
				"Kay\u0131t i\u015Fleminin tamamlanmas\u0131 i\u00E7in 10 kitap oylay\u0131n\u0131z.");
		lblKayitIslemi.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblKayitIslemi.setBounds(283, 254, 461, 20);
		contentPane.add(lblKayitIslemi);

		lblUserID = new JLabel("");
		lblUserID.setBounds(373, 93, 46, 14);
		contentPane.add(lblUserID);
		KitapListele();
		lblUserID.setText(Integer.toString(users.UserID()));

		a = Integer.toString(users.UserID());
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox.setBounds(469, 342, 86, 20);
		contentPane.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_1.setBounds(469, 373, 86, 20);
		contentPane.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_2.setBounds(469, 404, 86, 20);
		contentPane.add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_3.setBounds(469, 435, 86, 20);
		contentPane.add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_4.setBounds(469, 466, 86, 20);
		contentPane.add(comboBox_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_5.setBounds(469, 497, 86, 20);
		contentPane.add(comboBox_5);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_6.setBounds(469, 528, 86, 20);
		contentPane.add(comboBox_6);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_7.setBounds(469, 559, 86, 20);
		contentPane.add(comboBox_7);

		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_8.setBounds(469, 590, 86, 20);
		contentPane.add(comboBox_8);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(
				new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_9.setBounds(469, 621, 86, 20);
		contentPane.add(comboBox_9);

	}

	private void KitapListele() {
		ArrayList<Books> KitapListele = books.KitapListele();

		Object[][] data = new Object[KitapListele.size()][];
		for (int i = 0; i < data.length; i++) {
			data[i] = new Object[] { KitapListele.get(i).getIsbn(), KitapListele.get(i).getBook_tittle(),
					KitapListele.get(i).getBook_author() };
		}
		table.setModel(new DefaultTableModel(data, new String[] { "ISBN", "Book Title", "Book Author" }));
	}
}
