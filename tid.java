class tid
{
	public static void main(String[] args)
	{
		int secDay = 60 * 60 * 24;
		int secYear = secDay * 365;
		int time = 2023 - 1970;
		int secSince1970 = time * secYear;
		int secToYear = secSince1970 / 365 / 24 / 60 / 60;

		System.out.println(secToYear / time);
	}
}