
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] dizi_cahr = {'J','A','V','A'};
		Integer[] dizi_int = {1,2,3,4};
		String[] dizi_string = {"python","hava","php"};
		
		YazdırmaSinifi<Character> yazdır_char = new YazdırmaSinifi<Character>();
		YazdırmaSinifi<Integer> yazdır_int = new YazdırmaSinifi<Integer>();
		YazdırmaSinifi<String> yazdır_string = new YazdırmaSinifi<String>();
		
		yazdır_char.yazdir(dizi_cahr);
		yazdır_int.yazdir(dizi_int);
		yazdır_string.yazdir(dizi_string);
		

	}

}
