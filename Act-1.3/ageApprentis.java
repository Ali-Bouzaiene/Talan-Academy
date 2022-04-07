public class ageApprentis{

public static void main(String[] args) {

int[] ageArray = {45, 54, 23, 32, 64, 46, 28, 82};

int i,j,sauv,k;

	for (i = 0 ; i < ageArray.length; i++ ) {

	sauv=i;

	for (j = i+1 ; j < ageArray.length; j++ ) {
	if (ageArray[j]>ageArray[sauv]) {
	sauv=j;
	}
	}
	k=ageArray[sauv];
	ageArray[sauv]=ageArray[i];
	ageArray[i]=k;
	}
	for (i = 0 ; i < ageArray.length; i++ ) {
	System.out.println(ageArray[i]);
	}
}
}