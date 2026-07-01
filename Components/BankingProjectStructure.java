import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class BankingProjectStructure{
	public static void main(String args[]){
		SampleFrame sf= new SampleFrame();
		sf.setVisible(true);
		sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class SampleFrame extends JFrame{
	public SampleFrame(){
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension srcSize= kit.getScreenSize();
		int w= srcSize.width;
		int h= srcSize.height;
		setSize(450,600);
		setLocation(w/6, h/8);
		setResizable(false);
		setTitle("Structure");
		FramePanel fp = new FramePanel();
        		add(fp);
	}
}

class FramePanel extends JPanel{
	public void paintComponent(Graphics g){
    		super.paintComponent(g);
      		setBackground(new Color(60, 125, 65));
	}
	
	FramePanel(){
		setLayout(null);
		DefaultMutableTreeNode bankSystem=new DefaultMutableTreeNode("Banking Project");
		DefaultMutableTreeNode src=new DefaultMutableTreeNode("src");
		DefaultMutableTreeNode lib=new DefaultMutableTreeNode("lib");
		DefaultMutableTreeNode database=new DefaultMutableTreeNode("database");

		DefaultMutableTreeNode mainJava=new DefaultMutableTreeNode("Main.java");
		DefaultMutableTreeNode model=new DefaultMutableTreeNode("model");
		DefaultMutableTreeNode view=new DefaultMutableTreeNode("view");
		DefaultMutableTreeNode controller=new DefaultMutableTreeNode("controller");
		DefaultMutableTreeNode service=new DefaultMutableTreeNode("service");
		DefaultMutableTreeNode databases=new DefaultMutableTreeNode("database");
		DefaultMutableTreeNode utility=new DefaultMutableTreeNode("utility");
		DefaultMutableTreeNode exception=new DefaultMutableTreeNode("exception");
		DefaultMutableTreeNode assets=new DefaultMutableTreeNode("assets");

		DefaultMutableTreeNode account=new DefaultMutableTreeNode("Account.java");
		DefaultMutableTreeNode coustomer=new DefaultMutableTreeNode("Coustomer.java");
		DefaultMutableTreeNode transaction=new DefaultMutableTreeNode("Transaction.java");
		DefaultMutableTreeNode admin=new DefaultMutableTreeNode("Admin.java");
		DefaultMutableTreeNode bank=new DefaultMutableTreeNode("Bank.java");

		DefaultMutableTreeNode loginFrame=new DefaultMutableTreeNode("LoginFrame.java");
		DefaultMutableTreeNode registerFrame=new DefaultMutableTreeNode("RegisterFrame.java");
		DefaultMutableTreeNode dashboardFrame=new DefaultMutableTreeNode("DashboardFrame.java");
		DefaultMutableTreeNode withdrawFrame=new DefaultMutableTreeNode("WithdrawFrame.java");
		DefaultMutableTreeNode trasferFrame=new DefaultMutableTreeNode("TrasferFrame.java");
		DefaultMutableTreeNode balanceFrame=new DefaultMutableTreeNode("BalanceFrame.java");
		DefaultMutableTreeNode transactionFrame=new DefaultMutableTreeNode("TransactionFrame.java");
		DefaultMutableTreeNode profileFrame=new DefaultMutableTreeNode("ProfileFrame.java");
		DefaultMutableTreeNode adminFrame=new DefaultMutableTreeNode("AdminFrame.java");

		DefaultMutableTreeNode loginController=new DefaultMutableTreeNode("LoginController.java");
		DefaultMutableTreeNode registerController=new DefaultMutableTreeNode("RegisterController.java");
		DefaultMutableTreeNode accountController=new DefaultMutableTreeNode("AccountController.java");
		DefaultMutableTreeNode transactionController=new DefaultMutableTreeNode("TransactionController.java");
		DefaultMutableTreeNode adminController=new DefaultMutableTreeNode("AdminController.java");

		DefaultMutableTreeNode authenticationService=new DefaultMutableTreeNode("AuthenticationService.java");
		DefaultMutableTreeNode accountService=new DefaultMutableTreeNode("AccountService.java");
		DefaultMutableTreeNode transactionService=new DefaultMutableTreeNode("TransactionService.java");
		DefaultMutableTreeNode bankService=new DefaultMutableTreeNode("BankService.java");
		DefaultMutableTreeNode validationService=new DefaultMutableTreeNode("ValidationService.java");

		DefaultMutableTreeNode dbConnection=new DefaultMutableTreeNode("DBConnection.java");
		DefaultMutableTreeNode accountDAO=new DefaultMutableTreeNode("AccountDAO.java");
		DefaultMutableTreeNode transactionDAO=new DefaultMutableTreeNode("TransactionDAO.java");
		DefaultMutableTreeNode adminDAO=new DefaultMutableTreeNode("AdminDAO.java");

		DefaultMutableTreeNode generateAccountNumber=new DefaultMutableTreeNode("GenerateAccountNumber.java");
		DefaultMutableTreeNode dateUtil=new DefaultMutableTreeNode("DateUtil.java");
		DefaultMutableTreeNode messageUtil=new DefaultMutableTreeNode("MessageUtil.java");
		DefaultMutableTreeNode passwordEncryption=new DefaultMutableTreeNode("PasswordEncryption.java");
		DefaultMutableTreeNode validation=new DefaultMutableTreeNode("Validation.java");

		DefaultMutableTreeNode invalidAmountException=new DefaultMutableTreeNode("InvalidAmountException.java");
		DefaultMutableTreeNode accountNotFoundException=new DefaultMutableTreeNode("AccountNotFoundException.java");
		DefaultMutableTreeNode insufficientBalanceException=new DefaultMutableTreeNode("InsufficientBalanceException.java");
		DefaultMutableTreeNode invalidUserException=new DefaultMutableTreeNode("InvalidUserException.java");

		DefaultMutableTreeNode icons=new DefaultMutableTreeNode("icons/");
		DefaultMutableTreeNode images=new DefaultMutableTreeNode("images/");
		DefaultMutableTreeNode background=new DefaultMutableTreeNode("background/");

		DefaultMutableTreeNode mysqlConnector=new DefaultMutableTreeNode("mysql-connector.jar");
		DefaultMutableTreeNode bankingSql=new DefaultMutableTreeNode("banking.sql");

		bankSystem.add(src);
		bankSystem.add(lib);
		bankSystem.add(database);
		
		src.add(mainJava);
		src.add(model);
		src.add(view);
		src.add(controller);
		src.add(service);
		src.add(databases);
		src.add(utility);
		src.add(exception);
		src.add(assets);
		
		model.add(account);
		model.add(coustomer);
		model.add(transaction);
		model.add(admin);
		model.add(bank);

		view.add(loginFrame);
		view.add(registerFrame);
		view.add(dashboardFrame);
		view.add(withdrawFrame);
		view.add(trasferFrame);
		view.add(balanceFrame);
		view.add(transactionFrame);
		view.add(profileFrame);
		view.add(adminFrame);

		controller.add(loginController);
		controller.add(registerController);
		controller.add(accountController);
		controller.add(transactionController);
		controller.add(adminController);

		service.add(authenticationService);
		service.add(accountService);
		service.add(transactionService);
		service.add(bankService);
		service.add(validationService);
	
		databases.add(dbConnection);
		databases.add(accountDAO);
		databases.add(transactionDAO);
		databases.add(adminDAO);

		utility.add(generateAccountNumber);
		utility.add(dateUtil);
		utility.add(messageUtil);
		utility.add(passwordEncryption);
		utility.add(validation);

		exception.add(invalidAmountException);
		exception.add(accountNotFoundException);
		exception.add(insufficientBalanceException);
		exception.add(invalidUserException);

		assets.add(icons);
		assets.add(images);
		assets.add(background);
		
		lib.add(mysqlConnector);
		database.add(bankingSql);

		JTree tree=new JTree(bankSystem);
		tree.setBounds(10,15,400,500);
		//add(tree);

		JScrollPane sp=new JScrollPane(tree);
		sp.setBounds(10,15,400,500);
		add(sp);
	}   
}