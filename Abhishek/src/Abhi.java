
public class Abhi {
public static void main(String[] args) {
	//int size =args.length;
	//if (size  ==0) {
		//System.out.println("usage: java HelloA11 n1 n2 n3 ");
	//}else {
		//for (int i=0; i<size; i++) {
			//System.out.println(i+"Hello"+args [i]);
	
	//{HELLO SWITCH}
	int size=0;
	switch (size) {
	case 0:
		System.out.println("usage: java HelloAll n1 n2 n3..");break;
	case 1:
		System.out.println("hello"+args[0]);
		break;
	default:
		for(int i=0; i<size; i++) {
			System.out.println(i+ "= Hello"+args [0]);
			//for
			//switch
			//method
		}
	}
}
}
