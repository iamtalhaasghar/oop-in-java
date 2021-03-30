/*
    ***REMOVED*** ***REMOVED***
    (***REMOVED***)
  
    ***REMOVED*** Lab ***REMOVED*** # 2
    Java FX
    Simple GUI Calculator App
    
*/

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;



public class Calculator extends Application{

	
	Button zero;
	Button one;
	Button two ;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight ;
	Button nine ;
	Button clear ;
	Button calculate;
	Button add  ;
	Button sub ;
	Button mul ;
	Button div ;	
	Button ans ;
	Button dot ;
	Button delete;
	ToggleButton power;

	private double calcAns;

	Background defaultBackground;

	boolean backgroundChanged;

	public static void main(String []args){

		launch(args);

	}

	public void start (Stage myStage){

		myStage.setResizable(false);
		myStage.setTitle("Calculator by ***REMOVED*** ***REMOVED***");

		try{
			myStage.getIcons().add(new Image("\\CalculatorIcon.png"));
		}catch (Exception e){

			System.out.println("Error: Can not load Icon Image.");
		}

		BorderPane rootNode = new BorderPane();
		Scene myScene = new Scene(rootNode,500,600);

		myStage.setScene(myScene);

		GridPane gridLayout = new GridPane();

		gridLayout.setAlignment(Pos.CENTER);

		rootNode.setCenter(gridLayout);

		Text head = new Text("My Calculator");
		head.setFont(new Font("Candara",40));
		head.setFill(Color.WHITE);


		Label heading = new Label (null,head);
		heading.setPrefHeight(100);
		heading.setPrefWidth(310);
		heading.setAlignment(Pos.CENTER);
		heading.setBackground(new Background(new BackgroundFill(Color.GREEN,
			new CornerRadii(8),new Insets(1) )));


		TextField input = new TextField();
		input.setPrefHeight(70);
		input.setAlignment(Pos.CENTER_LEFT);
		input.setFont(new Font("Cambria Math",22));

		input.setEditable(false);

		Text myName = new Text(String.format("Developed by :   ***REMOVED*** ***REMOVED*** %80s ",
			"Version :  1.0"));

		myName.setFont(new Font("Candara",14));

		Label credits = new Label(null,myName);
		rootNode.setBottom(credits);
		rootNode.setMargin(credits,new Insets(0,0,10,10));	


		Separator endLine = new Separator(Orientation.HORIZONTAL);


		zero = new Button("0");
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		clear = new Button("C");
		calculate = new Button("=");
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");	
		ans = new Button("Ans");
		dot = new Button(".");
		delete = new Button("Del");
		power = new ToggleButton("Off");

		makeButtonsGlow(10);

		zero.setPrefHeight(60);		
		one.setPrefHeight(60);
		two.setPrefHeight(60);
		three.setPrefHeight(60);
		four.setPrefHeight(60);
		five.setPrefHeight(60);
		six.setPrefHeight(60);
		seven.setPrefHeight(60);
		eight.setPrefHeight(60);
		nine.setPrefHeight(60);
		mul.setPrefHeight(60);
		div.setPrefHeight(60);
		add.setPrefHeight(60);
		sub.setPrefHeight(60);
		calculate.setPrefHeight(60);
		clear.setPrefHeight(60);
		delete.setPrefHeight(60);
		ans.setPrefHeight(60);
		dot.setPrefHeight(60);
		power.setPrefHeight(60);

		zero.setPrefWidth(70);		
		one.setPrefWidth(70);
		two.setPrefWidth(70);
		three.setPrefWidth(70);
		four.setPrefWidth(70);
		five.setPrefWidth(70);
		six.setPrefWidth(70);
		seven.setPrefWidth(70);
		eight.setPrefWidth(70);
		nine.setPrefWidth(70);
		mul.setPrefWidth(70);
		div.setPrefWidth(70);
		add.setPrefWidth(70);
		sub.setPrefWidth(70);
		calculate.setPrefWidth(70);
		clear.setPrefWidth(70);
		delete.setPrefWidth(70);
		dot.setPrefWidth(70);
		ans.setPrefWidth(70);
		power.setPrefWidth(70);

		zero.setFont(new Font("Tahoma",22));
		one.setFont(new Font("Tahoma",22));
		two.setFont(new Font("Tahoma",22));
		three.setFont(new Font("Tahoma",22));
		four.setFont(new Font("Tahoma",22));
		five.setFont(new Font("Tahoma",22));
		six.setFont(new Font("Tahoma",22));
		seven.setFont(new Font("Tahoma",22));
		eight.setFont(new Font("Tahoma",22));
		nine.setFont(new Font("Tahoma",22));
		mul.setFont(new Font("Tahoma",22));
		div.setFont(new Font("Tahoma",22));
		add.setFont(new Font("Tahoma",22));
		sub.setFont(new Font("Tahoma",22));
		calculate.setFont(new Font("Tahoma",22));
		clear.setFont(new Font("Tahoma",22));
		delete.setFont(new Font("Tahoma",22));
		ans.setFont(new Font("Tahoma",22));
		dot.setFont(new Font("Tahoma",22));
		power.setFont(new Font("Tahoma",22));

		power.setTooltip(new Tooltip("Power Button"));
		input.setTooltip(new Tooltip("Enter your text Here"));
		
		
		gridLayout.setHgap(10);
		gridLayout.setVgap(10);
		gridLayout.setGridLinesVisible(false);

		gridLayout.addRow( 0,heading);
		gridLayout.addRow( 1,input);


		gridLayout.setColumnSpan(heading,4);
		gridLayout.setColumnSpan(input,4);
		

		gridLayout.addRow(
			2,seven,eight,nine,power
		);


		gridLayout.addRow(
			3,four,five,six,add
		);


		gridLayout.addRow(
			4,one,two,three,sub
		);

		gridLayout.addRow(
			5,clear,zero,calculate,mul
		);

		gridLayout.addRow(
			6,delete,dot,ans,div
		);

		gridLayout.addRow(7,endLine);
		gridLayout.setColumnSpan(endLine,4);

		power.setOnAction((ActionEvent ae) -> {
			
			if(defaultBackground == null)
				defaultBackground = zero.getBackground();

			if(power.isSelected()){
				power.setText("On");
				power.setEffect(new InnerShadow(20,Color.SPRINGGREEN));	
				power.setTextFill(Color.DEEPPINK);		
				makeButtonsGlow(0);
				setTooltips();
				input.setEditable(true);

				ans.setTooltip(new Tooltip("Uses last answer in current calculation"));
			}
			else{
				Alert message = new Alert(Alert.AlertType.CONFIRMATION,
				"Are you sure ?\nNOTE : If you click YES then All Data might be lost !!",
				ButtonType.YES,ButtonType.NO);

				message.setTitle("Power OFF Confirmation");
				message.setHeaderText("Shutdown Calculator");

				message.showAndWait().ifPresent( response ->{
					if(response==ButtonType.YES){
						power.setEffect(new InnerShadow(0,Color.TURQUOISE));
						power.setText("Off");
						power.setTextFill(Color.BLACK);
						makeButtonsGlow(10);
						input.setText("");
						setButtonsTextColorToDefault();
						if(backgroundChanged){
							setButtonsBackgroundToDefault();
						}
			
						setOffTooltips();
						input.setEditable(false);											
					}
					else{
						power.setSelected(true);
															
					}
				});
			

			}			
		});
		

		zero.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){			
				input.setEffect(null);
				input.appendText("0");

			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
						
		});

		one.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("1");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
			
		});

		two.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("2");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
				
		});		
		
		three.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("3");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}		
		});

		four.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("4");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		five.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("5");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		six.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("6");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		seven.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("7");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		eight.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("8");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}		
		});		
		
		nine.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("9");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});
		
		dot.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText(".");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		delete.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				if(input.getLength()!=0)	
					input.deleteText(input.getLength()-1,
						input.getLength());
		
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

				
		clear.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){

				input.setText("");
				input.setEffect(null);
						
				setButtonsTextColorToDefault();
				if(backgroundChanged){
					setButtonsBackgroundToDefault();
				}
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		add.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				Alert message = new Alert(Alert.AlertType.INFORMATION,
					"I am just going to add these two numbers.");

				message.setTitle("Performing Summation");				
				message.setHeaderText("Addition");
				message.showAndWait();

				input.setEffect(null);
				input.appendText("+");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});
		
		sub.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("-");
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		mul.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				input.setEffect(null);
				input.appendText("*");

				changeButtonsTextColor();	// chnages text color of buttons
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});

		div.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){

				input.setEffect(null);
				input.appendText("/");
								
				changeButtonsBackground();	// changes background color of buttons
				backgroundChanged = true;
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}	
		});
		
		ans.setOnAction(event ->{ 
			if(power.isSelected()){
				input.setEffect(null);
			
				DecimalFormat myFormat = new DecimalFormat("#.###");
				String formatedAns = myFormat.format(calcAns);					
				
				input.setText(formatedAns);
			}
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}
		});



		calculate.setOnAction((ActionEvent ae) -> {
			if(power.isSelected()){
				String temporary = input.getText();
	
				temporary = temporary.trim();

				char [] inputData = temporary.toCharArray();
	
				if(inputData.length==0){

					input.setEffect(new InnerShadow(10.0,Color.RED));
					Alert message = new Alert(Alert.AlertType.WARNING,
						"Warning : No data was entered !!");

					message.setTitle("No Input");
					message.setHeaderText("Nothing to Perform");
					message.showAndWait();


				}


				else if(hasInvalidData(inputData) || hasInvalidOperator(inputData) ){

					input.setEffect(new InnerShadow(10.0,Color.RED));
			
					Alert message = new Alert(Alert.AlertType.ERROR,
						"Please check and correct your input!!");

					message.setTitle("Invalid Input");
					message.setHeaderText("Syntax Error");
					message.showAndWait();


				}
				else{
				
					boolean displayAns = true;
					try{
						calcAns = DMAS(inputData);
				  	}
				  	catch(NumberFormatException ex){

						input.setEffect(new InnerShadow(10.0,Color.RED));
						System.out.println("Exception when calling DMAS , "+ex);

						Alert message = new Alert(Alert.AlertType.ERROR,
						"A number can not contain multiple Decimal Points.");

						message.setTitle("Invalid Number");
						message.setHeaderText("Number Format Exception");
						message.showAndWait();

						displayAns = false;   		  
	
        	   			}
					if(displayAns){
						DecimalFormat myFormat = new DecimalFormat("#.###");
						String formatedAns = myFormat.format(calcAns);					
										
						input.setText(temporary);
						input.appendText(String.format(" = %s",formatedAns));

						Alert message = new Alert(Alert.AlertType.INFORMATION,
						String.format("***REMOVED*** ***REMOVED***! The Answer is %s",formatedAns));

						message.setTitle("***REMOVED*** ***REMOVED***");
						message.setHeaderText("Answer");
						message.showAndWait();

					} // end of if
				
				}		// end of else
			
			}	
			else{
				Alert message = new Alert(Alert.AlertType.INFORMATION,
				"Please turn \"ON\" Calculator first.");
				
				message.setTitle("Calculator Power");
				message.setHeaderText("Calculator is Powered \"OFF\"");
				message.showAndWait();

			}

		});
		
		
		
		rootNode.getChildren().addAll();
		myStage.show();

		
   	}	// end of method "start" 

	
//----------------------------------------------------------------------------------------------------------

	private boolean hasInvalidData(final char []temp){

		if( (temp.length==0) || (temp[temp.length-1] == '.' ) )
			return true;

		for(int i=0; i<temp.length ; i++)
		{
			if(temp[i]=='.' && temp[i+1]=='.') 
				return true;

			if (! (temp[i]=='1' ||temp[i]=='2'||temp[i]=='3'||temp[i]=='4'||
				temp[i]=='5'||temp[i]=='6'||temp[i]=='7'||
				temp[i]=='8'||temp[i]=='9'||temp[i]=='0'||
				temp[i]=='+' ||temp[i]=='-'||temp[i]=='*'||
				temp[i]=='/' || temp[i]=='.' ) )
			{
				return true;	
			}
			
			

		}

		return false;
	}

	private boolean hasInvalidOperator(final char []temp){

		if(temp.length==0)
			return true;

		else if ( (temp[0]=='+' ||temp[0]=='-'||temp[0]=='*'|| temp[0]=='/' ) ||
		     (temp[(temp.length-1)]=='+' ||temp[(temp.length-1)]=='-' ||
			temp[(temp.length-1)]=='*' || temp[(temp.length-1)]=='/')    )
		{

			return true;

		}


		for(int i=0; i <= (temp.length - 2) ; i++)
		{
			if ( (temp[i]=='+' ||temp[i]=='-'||temp[i]=='*'|| temp[i]=='/' ) &&
		     		(temp[(i+1)]=='+' ||temp[(i+1)]=='-' ||
					temp[(i+1)]=='*'|| temp[(i+1)]=='/' )    )
			{

				return true;

			}
			

		}

		return false;
	

	}

	private int countOperators(final char[] temp){
			
		int total =0;
		
		for(int i=0; i<temp.length ; i++){

			if ( temp[i]=='+' ||temp[i]=='-' ||
				temp[i]=='*'|| temp[i]=='/' ) 
			{
				total++;
			}	
		}
		
		return total;

	}


	private boolean hasOperator(final char[]temp, char sign){
		
		for(int i=0; i<temp.length ; i++){

			if ( temp[i]==sign  ){
				
				return true;
			}	
		}
		
		return false;
	}


	private int operatorIsAt(final char[]temp, char sign){

		for (int i=0; (hasOperator(temp,sign)) && (i< temp.length) ; i++){
			
			if ( temp[i]==sign  ){
				
				return i;
			}	

		}
		
		return -99;

	}

	private boolean hasAnyOperator(final char[]temp){
		
		for(int i=0; i<temp.length ; i++){

			if ( hasOperator(temp,'-')||hasOperator(temp,'+')||
				hasOperator(temp,'/') || hasOperator(temp,'*')  ){
				
				return true;
			}	
		}
		
		return false;
	}

	private char[] getOperators(final char []temp){

		char []op = new char[countOperators(temp)];

		int opIndex=0;

		for(int i=0; i<temp.length ; i++){
						
			if(temp[i]=='+' ||temp[i]=='-'||temp[i]=='*'||temp[i]=='/')
				op[opIndex++] = temp[i];
		
							
		}
		
		return op;

	}


	private double[] getNumbers(final char[]temp)
	throws java.lang.NumberFormatException{

		double []num = new double[countOperators(temp)+1];

		int numIndex=0;
		
		String digit = "";

		for(int i=0; i<temp.length ; i++){
						
			if(temp[i]=='1' ||temp[i]=='2'||temp[i]=='3'||temp[i]=='4'
				||temp[i]=='5'||temp[i]=='6'||temp[i]=='7'||
				temp[i]=='8'||temp[i]=='9'||temp[i]=='0'|| temp[i]=='.'  )
			{
				digit+=temp[i];
			}
			else{
				num[numIndex++] = Double.parseDouble(digit);				
				digit="";
			}

			if(i==temp.length-1){	
				num[numIndex++] = Double.parseDouble(digit);
				digit="";
				
			}
						
		}	// end of for loop
		

		return num;
	}

	private char[] updateOperators(final char []temp,final int index){

		char[] newOp = new char[temp.length-1];
			
		System.arraycopy(temp,0,newOp,0,index);
		if((temp.length-1)>index) 
			System.arraycopy(temp,index+1,newOp,index,(temp.length-1)-index);

		return newOp;
	}

	private double[] updateNumbers(final double []temp,final int index){

		double[] newNum = new double[temp.length-1];
			
		System.arraycopy(temp,0,newNum,0,index);
		if((temp.length-1)>index) 
			System.arraycopy(temp,index+1,newNum,index,(temp.length-1)-index);

		return newNum;
	}



	private double DMAS(char []inputData){

		char[] operators = getOperators(inputData);
		double [] numbers = getNumbers(inputData);

		System.out.print("\nNumbers entered are : "+numbers.length);
		for(double t : numbers)
			System.out.print(" ,"+t);
				
		System.out.print("\nOperators entered are : "+operators.length);
		for(char t : operators)
			System.out.print(" ,"+t);
		System.out.println();

		while( hasAnyOperator(operators) ){

			while( hasOperator(operators,'/') ){
					
				int k = operatorIsAt(operators,'/');

				System.out.println("k: "+k+" d> "+numbers[k]+"/"+numbers[k+1]+"="
				+(numbers[k] / numbers[k+1]) );

				numbers[k+1] = numbers[k] / numbers[k+1]; 						

				operators=updateOperators(operators,k);
				numbers=updateNumbers(numbers,k);

				System.out.print("\nUpdated numbers are : "+numbers.length);
				for(double t : numbers)
					System.out.print(" ,"+t);
				
				System.out.print("\nUpdated Operators are : "+operators.length);
				for(char t : operators)
					System.out.print(" ,"+t);							
				System.out.println();			
			}
	
			while( hasOperator(operators,'*') ){
					
				int k = operatorIsAt(operators,'*');

				System.out.println("k: "+k+" m> "+numbers[k]+"*"+numbers[k+1]+"="
					+(numbers[k] * numbers[k+1]) );					

				numbers[k+1] = numbers[k] * numbers[k+1];

				operators=updateOperators(operators,k);
				numbers=updateNumbers(numbers,k);

				System.out.print("\nUpdated numbers are : "+numbers.length);
				for(double t : numbers)
					System.out.print(" ,"+t);
				
				System.out.print("\nUpdated Operators are : "+operators.length);
				
				for(char t : operators)
					System.out.print(" ,"+t);							
				
				System.out.println();	
			}

			while( hasOperator(operators,'-') ){
					
				int k = operatorIsAt(operators,'-');

				System.out.println("k: "+k+" s> "+numbers[k]+"-"+numbers[k+1]+"="
					+(numbers[k] - numbers[k+1]) );

				numbers[k+1] = numbers[k] - numbers[k+1];

				operators=updateOperators(operators,k);
				numbers=updateNumbers(numbers,k);

				System.out.print("\nUpdated numbers are : "+numbers.length);
				for(double t : numbers)
					System.out.print(" ,"+t);
				
				System.out.print("\nUpdated Operators are : "+operators.length);
				for(char t : operators)
					System.out.print(" ,"+t);							
				System.out.println();	
			}


			while( hasOperator(operators,'+') ){
					
			int k = operatorIsAt(operators,'+');

			System.out.println("k: "+k+" a> "+numbers[k]+"+"+numbers[k+1]+"="
				+(numbers[k] + numbers[k+1]) );	
 

			numbers[k+1] = numbers[k] + numbers[k+1];

			operators=updateOperators(operators,k);
			numbers=updateNumbers(numbers,k);

			System.out.print("\nUpdated numbers are : "+numbers.length);
			for(double t : numbers)
				System.out.print(" ,"+t);
				
			System.out.print("\nUpdated Operators are : "+operators.length);
			for(char t : operators)
				System.out.print(" ,"+t);							
			System.out.println();		
	
			}




		}	 // end of while loop	

		System.out.println("Final Ans : " + numbers[numbers.length-1] );
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		return (numbers[numbers.length-1]);


	}	// end of function "DMAS"

	private void changeButtonsTextColor(){

		zero.setTextFill(Color.BLUE);
		one.setTextFill(Color.BLUEVIOLET);
		two.setTextFill(Color.BROWN);
		three.setTextFill(Color.CORAL);
		four.setTextFill(Color.CRIMSON);
		five.setTextFill(Color.DARKCYAN);
		six.setTextFill(Color.DARKGREEN);
		seven.setTextFill(Color.DARKRED);
		eight.setTextFill(Color.DARKORCHID);
		nine.setTextFill(Color.MAROON);
		add.setTextFill(Color.YELLOW);
		sub.setTextFill(Color.ROYALBLUE);
		div.setTextFill(Color.DEEPSKYBLUE);
		mul.setTextFill(Color.RED);
		clear.setTextFill(Color.FIREBRICK);
		calculate.setTextFill(Color.DARKMAGENTA);
		ans.setTextFill(Color.SEAGREEN);
		delete.setTextFill(Color.ORANGERED);
		dot.setTextFill(Color.BLACK);
	}

	private void setButtonsTextColorToDefault(){

		zero.setTextFill(Color.web("0x333333ff"));
		one.setTextFill(Color.web("0x333333ff"));
		two.setTextFill(Color.web("0x333333ff"));
		three.setTextFill(Color.web("0x333333ff"));
		four.setTextFill(Color.web("0x333333ff"));
		five.setTextFill(Color.web("0x333333ff"));
		six.setTextFill(Color.web("0x333333ff"));
		seven.setTextFill(Color.web("0x333333ff"));
		eight.setTextFill(Color.web("0x333333ff"));
		nine.setTextFill(Color.web("0x333333ff"));
		add.setTextFill(Color.web("0x333333ff"));
		mul.setTextFill(Color.web("0x333333ff"));
		sub.setTextFill(Color.web("0x333333ff"));
		div.setTextFill(Color.web("0x333333ff"));
		clear.setTextFill(Color.web("0x333333ff"));
		calculate.setTextFill(Color.web("0x333333ff"));
		delete.setTextFill(Color.web("0x333333ff"));
		ans.setTextFill(Color.web("0x333333ff"));
			
	}

	private void changeButtonsBackground(){

		zero.setBackground(new Background(new BackgroundFill(Color.THISTLE,
			new CornerRadii(8),null )));
		one.setBackground(new Background(new BackgroundFill(Color.GREEN,
			new CornerRadii(8),null )));
		two.setBackground(new Background(new BackgroundFill(Color.LIME,
			new CornerRadii(8),null )));
		three.setBackground(new Background(new BackgroundFill(Color.VIOLET,
			new CornerRadii(8),null )));
		four.setBackground(new Background(new BackgroundFill(Color.ORANGE,
			new CornerRadii(8),null )));

		five.setBackground(new Background(new BackgroundFill(Color.FIREBRICK,
			new CornerRadii(8),null )));
		six.setBackground(new Background(new BackgroundFill(Color.DARKMAGENTA,
			new CornerRadii(8),null )));
		seven.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE,
			new CornerRadii(8),null )));
		eight.setBackground(new Background(new BackgroundFill(Color.YELLOW,
			new CornerRadii(8),null )));
		nine.setBackground(new Background(new BackgroundFill(Color.CHARTREUSE,
			new CornerRadii(8),null )));
		add.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN,
			new CornerRadii(8),null )));
		mul.setBackground(new Background(new BackgroundFill(Color.LIGHTSEAGREEN,
			new CornerRadii(8),null )));
		div.setBackground(new Background(new BackgroundFill(Color.TURQUOISE,
			new CornerRadii(8),null )));
		sub.setBackground(new Background(new BackgroundFill(Color.SPRINGGREEN,
			new CornerRadii(8),null )));
		calculate.setBackground(new Background(new BackgroundFill(Color.TEAL,
			new CornerRadii(8),null )));
		clear.setBackground(new Background(new BackgroundFill(Color.TOMATO,
			new CornerRadii(8),null )));
		ans.setBackground(new Background(new BackgroundFill(Color.WHEAT,
			new CornerRadii(8),null )));
		delete.setBackground(new Background(new BackgroundFill(Color.RED,
			new CornerRadii(8),null )));
		dot.setBackground(new Background(new BackgroundFill(Color.SEAGREEN,
			new CornerRadii(8),null )));	
	}

	private void setButtonsBackgroundToDefault(){

		zero.setBackground(defaultBackground);
		one.setBackground(defaultBackground);
		two.setBackground(defaultBackground);
		three.setBackground(defaultBackground);
		four.setBackground(defaultBackground);
		five.setBackground(defaultBackground);
		six.setBackground(defaultBackground);
		seven.setBackground(defaultBackground);
		eight.setBackground(defaultBackground);
		nine.setBackground(defaultBackground);
		add.setBackground(defaultBackground);
		mul.setBackground(defaultBackground);
		div.setBackground(defaultBackground);
		sub.setBackground(defaultBackground);
		calculate.setBackground(defaultBackground);
		clear.setBackground(defaultBackground);
		ans.setBackground(defaultBackground);
		dot.setBackground(defaultBackground);
		delete.setBackground(defaultBackground);
	}

	private void makeButtonsGlow(double value){
		
		zero.setEffect(new Glow(value));
		one.setEffect(new Glow(value));
		two.setEffect(new Glow(value));
		three.setEffect(new Glow(value));
		four.setEffect(new Glow(value));
		five.setEffect(new Glow(value));
		six.setEffect(new Glow(value));
		seven.setEffect(new Glow(value));
		eight.setEffect(new Glow(value));
		nine.setEffect(new Glow(value));
		ans.setEffect(new Glow(value));
		calculate.setEffect(new Glow(value));
		dot.setEffect(new Glow(value));
		clear.setEffect(new Glow(value));
		delete.setEffect(new Glow(value));
			
		div.setEffect(new Glow(value));
		add.setEffect(new Glow(value));
		mul.setEffect(new Glow(value));
		sub.setEffect(new Glow(value));
			
	}

	private void setTooltips(){

		ans.setTooltip(new Tooltip("Uses last answer in current calculation"));
		delete.setTooltip(new Tooltip("Deletes the last Character of Text Field Input"));
		clear.setTooltip(new Tooltip("Clears whole Text Field Input"));
		dot.setTooltip(new Tooltip("Decimal Point"));
		calculate.setTooltip(new Tooltip("Calculates the answer"));


	}

	private void setOffTooltips(){
		
		Tooltip offMsg = new Tooltip("[Calculator is Off] Turn it on.");

		ans.setTooltip(offMsg);
		delete.setTooltip(offMsg);
		clear.setTooltip(offMsg);
		dot.setTooltip(offMsg);
		calculate.setTooltip(offMsg);


	}

	
}	// end of class "Calculator"
