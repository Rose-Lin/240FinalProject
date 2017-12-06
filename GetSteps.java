import java.util.*;
import java.io.*;

class GetSteps{
	public static ArrayList<String> operations = new ArrayList<String>();
	public static void main(String[] args){
		if(args.length < 2) {
			System.out.println("Please enter a number");
		} else {
			int result = getsteps(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			System.out.println("result is " + result);
		}
	}

	public static int getsteps(int input, int target) {
		if(input == target || input <= 0) {
			return 0;
		} 
		if(input % 2 == 0) {
			if(input % 3 == 0) {
				return 1 + Math.min(getsteps(input-1, target), Math.min(getsteps(input/2, target), getsteps(input/3, target)));
			}else{
				return 1 + Math.min(getsteps(input-1, target), getsteps(input/2, target));
			}
		} else {
			return 1 + getsteps(input-1, target);
		}
	}
}