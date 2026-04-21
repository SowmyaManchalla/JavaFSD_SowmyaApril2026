package Day6;

public class TC_Twodimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{2,3},{4,5},{30,60}};
		
		int td[][] = new int[3][3];
		td[0][0] = 1000;
		td[0][1] = 1001;
		td[0][3] = 5000;
		
		for(int i=0;i<td.length;i++)
		{
			for(int j=0;j<td[i].length;j++)
			{
				System.out.println(td[i][j]);
			}
		}
	}

}
