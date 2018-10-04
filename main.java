
public class main {

	public static void main(String[] args) {
		int [] c1 ={3,8,5,2,4};
		int[] c2 ={7,1,6,9,6};
		int f = 5;
		int s1 = sedes.sedesConCostedeTraslado(c1, c2, f);
		int s0 = sedes.sedesSinCostedeTraslado(c1, c2, f);
		System.out.println(s0 + " " + s1);
	}

}
