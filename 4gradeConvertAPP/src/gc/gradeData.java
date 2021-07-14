package gc;
import gc.gradeConvertAPP;

public class gradeData {
	private int readInputNumber;
	
///////////////////////////2. int getNumber()///////////////////	
	public int getNumber(){
		return readInputNumber;
	}
//////////////////////////1. void setNumber(int number)////////////	
	public void setNumber(int readInputNumber){
		this.readInputNumber = readInputNumber;		
}
	
/////////////////3. String getLetter()//////////////////////////
	public String getLetter(){
		//this.grade.equals(grade);
		String grade = "";
		
		//fill out this if statement for grade levels  
		if (readInputNumber < 1 || readInputNumber >100){
			System.out.println("Please enter a valid number between 1 - 100!");			
		}
		else if(readInputNumber > 87){
        	grade = "A";
        }
        else if(readInputNumber > 79){
        	grade = "B";
        }
        else if(readInputNumber > 66){
        	grade = "C";
        }
        else if(readInputNumber > 59){
        	grade = "D";
        }
        else if(readInputNumber < 60){
        	grade = "F";
        }
		return grade;
	}

}
