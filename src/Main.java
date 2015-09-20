/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/AL_22_01/
 */

import java.io.*;
import java.util.Arrays;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = readInt(br);
		
		for(int i=0; i<t; i++)
		{
			int n = readInt(br);
			int k = readInt(br);
			int[] CenaUbrania = new int[n];
			for(int j=0; j<n; j++)
			{
				CenaUbrania[j] = readInt(br);
			}
			Arrays.sort(CenaUbrania);
			/*for(int e : CenaUbrania)
			{
				System.out.print(e + ", ");
			}
			System.out.println();*/
			
			long suma=0;
			int naliczanie=1;
			for(int m=n-1; 0<=m; m--)
			{
				if(naliczanie == k)
				{
					suma = CenaUbrania[m]+suma;
					//System.out.print(suma + ", ");
					naliczanie=0;
				}
				naliczanie++;
			}
			System.out.println(suma);	
		}
	}
	
	public static int readInt(BufferedReader br) throws IOException
	{
		//Wczytywaj znaki (spacje, entery i takie tam) az bedzie jakas cyfra (minus zmienia na ujemna)
		int znak;
		int wynik = 0;
		int znakLiczby = 1;
		do 
		{
			znak = br.read();
			if (znak == '-')
			{
				znakLiczby = -1;
				continue;
			}
		} while (znak < '0' || znak > '9');
		wynik = 0;
		//Wczytywaj cyfry i tworz inta, az napotkasz inny znak
		while ( (znak >= '0' && znak <= '9'))
		{
			wynik = wynik * 10 + znak - '0';
			znak = br.read();
		}
		return wynik * znakLiczby;
	}
}
