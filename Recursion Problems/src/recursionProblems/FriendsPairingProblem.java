package recursionProblems;

public class FriendsPairingProblem {

	public static void main(String[] args) {
		System.out.println(friendsPairing(3));
	}
	public static int friendsPairing(int n ) {
		if(n == 1|| n ==2) {
			return n;
		}
		
//		//choice
//		//single
//		int fnm1 = friendsPairing(n-1);
//		//pair
//		int fnm2 = friendsPairing(n-2);
//		int pairWays = (n-1) * fnm2;
//		int totWays = fnm1 +pairWays;
//		return totWays;
		
		//Firstly one person is single then friendsPairing(n-1) will be taken
		//If this person wants to be friends with other persons then he/she will have (n-1)* friendsPairing(n-2) choices will be there
		
		//n = 5
       //fp(4) + 4*fp(3)
		//fp(3)+3*fp(2)+4*fp(3)
		//fp(2)+6 +4*fp(3)
		//8+4*fp(2)+2*fp(1)
		//8+8+2=18
		
		return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
	}
}
