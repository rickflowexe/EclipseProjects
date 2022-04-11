
public class AufgabeFehlerImCode {

	public static void main(String[] args) {
			String[] namen = new String[5];
			int[] alter = new int[5];
			generiereNamenUndAlter(namen, alter);
			System.out.println(findeDenAeltesten(namen, alter));
		}
			private static void generiereNamenUndAlter(String[] namen, int[] alter) {
				namen[0] = "Anne";
				alter[0] = 52;
				namen[1] = "Kai";
				alter[1] = 28;
				namen[2] = "Lothar";
				alter[2] = 61;
				namen[3] = "Doppelspitze Claudia Reinhard";
				alter[3] = 51 + 54;
				namen[4] = "Guido";
				alter[4] = 45;
			}
			private static String findeDenAeltesten(String[] namen, int[] alter) {
				int oldest = alter[0];
				int indexOfOldest = 0;
				for(int i = 1; i < namen.length; i++) {
					if ( oldest < alter[i] ) {
						oldest = alter[i];
						indexOfOldest = i;
					}
				}
			return "Oldest and wisest person is " + namen[indexOfOldest] + " with an age of " 
			+ alter[indexOfOldest] + ". ";
			}
		}