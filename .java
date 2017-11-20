import java.util.Scanner;
import java.util.Stack;
/* This program accepts a string from user then checks for brackets if the string doesn't contain any brackets it outputs 
* "Error, String doesn't contain any brackets" 
* If the string has brackets it checks the order of brackets to check if brackets are balanced we define balanced as - if there's an opening bracket then there should be a closing bracket of the same kind e.g () [] {} in this case the brackets are balanced.  
* where the brackets start with a closing bracket or there exist an opening bracket with no closing the the string is not balanced 
*/

public class isBalanced{
	
	public static void main(String[] args) {
        boolean inputbracket = false; 
        Stack<Character> input1 = new Stack<Character>(); //creating stack for "("
		Stack<Character> input2 = new Stack<Character>(); //creating stack for "["
		Stack<Character> input3 = new Stack<Character>(); //creating stack for "{"
		System.out.print("Enter String to check: "); //prompts user for a string 
        Scanner scanner = new Scanner(System.in); 
        String sinput = scanner.nextLine();
		boolean state = false;	//Assigns state
        char[] c = sinput.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i] == '(' ){ //checks through the string and for a bracket
				input1.push(c[i]); //Pushes the bracket into the stack
				inputbracket = true; //returns true since bracket is in the input 
			}
			else if(c[i] == '['){ //checks through the string and for a bracket
				input2.push(c[i]);//Pushes the bracket into the stack
				inputbracket = true; //returns true since bracket is in the input
			}
            else if(c[i] == '{'){ //checks through the string and for a bracket
				input3.push(c[i]); //Pushes the bracket into the stack
				inputbracket = true; //returns true since bracket is in the input
			}		
			else if(c[i] == ')'){
				inputbracket = true;
				if(input1.empty() == true){ //checks if stack is empty before it pops
					state = true; // if stack is empty then the state is 
				}
				else{
					input1.pop();// if stack is not empty then Pop
				}
			}	
			else if(c[i] == ']'){
				inputbracket = true;
				if(input2.empty() == true){ //checks if stack is empty before it pops
					state = true; //if stack is empty then the state is 
				}
				else{
					input2.pop(); // if stack is not empty then Pop
				}		
			}	
			else if(c[i] == '}'){
				inputbracket = true;
				if(input3.empty() == true){ //checks if stack is empty before it pops
					state = true; // if stack is empty then the state is 
				}
				else{
					input3.pop(); // if stack is not empty then Pop 
				}	
			}
		}
		if ( inputbracket == false){ //checks if input has brackets
			System.out.println("Error,String doesn't contain any Brackets ");	//If string doesn't contain any brackets outputs Error    
		}else if ( inputbracket == true && state==false && input1.empty() == true && input2.empty() == true && input2.empty() == true ){
            System.out.println("String is balanced"); //outputs Valid string 
        }else {
            System.out.println("String is not Balanced "); //outputs Valid string
        scanner.close(); //Close scanner
		}
	}
	}
	
	
	


