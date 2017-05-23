package cn.hsw.niuke;
/**
 * 	@author  author: ShuWei Hu, 279577923@qq.com
	@date createTime��2017��4��5�� ����9:38:04
 	@version 1.0 
 	des:һ����ά������ϵ��£������ҵ������ж��Ƿ����ĳ����num
 */
public class FindPos {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[][]{{1,2, 3, 4},{5 ,7 ,9 ,10},
				{6 ,11, 12, 13},{8 ,14 ,15, 16}};
		
		outPutArr(arr);
		
		System.out.println(isExit(arr, 85));
		
		
	}
	
	
	public static boolean isExit(int[][] arr, int num){
		
		boolean flag = false;
		int rows = arr.length;
		
		if(arr != null ){
			int row = 0;
			int col = arr[row].length-1;
			while(row < rows && col>=0){
				if(arr[row][col] == num){
					flag = true;
					break;
				}else if (arr[row][col] > num) {
					col --;
				}else {
					row ++;
				}
			}
		}
		
		return flag;
	}
	
	public static void outPutArr(int[][] arr){
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(arr[i][j] +" ");
			}
			
			System.out.println();
		}
		
	}

}
