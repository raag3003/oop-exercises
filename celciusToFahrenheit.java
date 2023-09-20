class celciusToFahrenheit
{
	public static void main(String[] args)
	{
		float[] arrayC = new float[91];
		float[] arrayF = new float[91];
		int count1 = 0;
		float count2 = -5f;


		for (int i = 0; i<arrayC.length; i++)
		{
			arrayC[count1] = count2;
			arrayF[count1] = count2 * 9 / 5 + 32;
			System.out.println(arrayC[count1] + " + " + arrayF[count1]);
			count1++;
			count2 += 0.5f;
		}



	}
}