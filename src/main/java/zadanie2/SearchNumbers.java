package zadanie2;

public class SearchNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//przykładowe dane, posortowana malejąco tablica i szukana liczba	
	int[] num = {20, 17, 16, 12, 11, 9, 7, 5, 3, 2};
	int a = 15;
	
	//test działania programu
	SearchNumbers s = new SearchNumbers();	
	System.out.println(s.search(num, a));	
	}
	
	
	private boolean search(int[] numbers, int x){
		
		//zmienne oznaczające pierwszy, ostatni i środkowy indeks przedziału
		int start = 0;
		int end = numbers.length-1;
		int mid;
		
		
		//metoda najpierw porównuje liczbę ze środkowym indeksem a następnie, w zależnosći czy liczba jest mniejsza 
		//czy większa, zawęża przeszukiwany przedział o połowę i robi tak do momentu kiedy w przedziale znajduje 
		//się tylko 1 liczba;
		
		while(start<=end) {
			mid = (start+end)/2;
			if(numbers[mid] == x) {
				return true;
			} else if (x>numbers[mid]) {
				end=mid-1;
			} else {
				start=mid+1;
			}
		}
		return false;
	}
	
	 /*
	 Powyższa metoda jest to wyszukiwanie binarne - najszybsza możliwa metoda wyszukiwania w zbiorach posortowanych.
	 Złożoność obliczeniowa to O(log2n) - liczba operacji to logarytm o podstawie 2 z n gdzie n to liczba elementów tablicy.
	 Złożoność pamięciowa to O(n) - liczba zajętych komórek pamięci odpowiada liczbie elementów tablicy
	 */


}
