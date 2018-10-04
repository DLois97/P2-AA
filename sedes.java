
public class sedes {
public static int sedesSinCostedeTraslado(int[] c0, int[] c1, int f){
	int coste = 0;
	int anterior  = 0;
	if (c0[0] < c1[0]){
		coste = c0[0];
	} else {
		coste = c1[0];
	}
	for (int i = 1; i < c0.length;i++){
		if ((c0[i] < c1[i])&&(anterior == 0)){
			coste = coste + c0[i];
			anterior = 0;
		} else if ((c0[i] < c1[i])&&(anterior == 1)) {
			coste = coste + c0[i] + f;
			anterior = 0;
		} else if ((c0[i] > c1[i])&&(anterior == 1)){
			coste = coste + c1[i];
			anterior = 1;
		} else if ((c0[i] > c1[i])&&(anterior == 0)){
			coste = coste + c1[i] + f;
			anterior = 1;
		}
	}
	return coste;
}

public static int sedesConCostedeTraslado(int[] c0, int[] c1, int f){
	int coste = 0;
	int anterior  = 0;
	if (c0[0] < c1[0]){
		coste = c0[0];
	} else {
		coste = c1[0];
	}
	for (int i = 1; i < c0.length;i++){
		if ((c0[i] < (c1[i] + f))&&(anterior == 0)){
			coste = coste + c0[i];
			anterior = 0;
		} else if (((c0[i]+ f) < c1[i])&&(anterior == 1)) {
			coste = coste + c0[i] + f;
			anterior = 0;
		} else if (((c0[i]+ f) > c1[i])&&(anterior == 1)){
			coste = coste + c1[i];
			anterior = 1;
		} else if ((c0[i] > (c1[i]+f))&&(anterior == 0)){
			coste = coste + c1[i] + f;
			anterior = 1;
		}
	}
	return coste;
}
}

