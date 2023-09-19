class tempdif
{
	public static void main(String[] args)
	{
		int count1 = 0;
		int count2 = count1++;

		float[] days = {21.5f, 23.7f, 19.7f, 22.5f, 25.3f, 21.7f, 18.9f};

		for (int i = 0; i<6; i++)
		{
			System.out.println(days[count1] - days[count2]);
			count1++;
			if (count2 == 7)
			{
				count2 = 0;
			}
		}
	}
}