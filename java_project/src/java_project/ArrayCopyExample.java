package java_project;

public class ArrayCopyExample {
	public static void main (String [] args ) {
		//배열 복사
		//1) 배열복사
		//-배열은 한번 생성하면 크기 변경 불가
		// 더 많은 저장 공간이 필요하다면 보다 큰 배열을 새로 만들고 이전 
		//배열들로부터 함목 값들을 복사
		//2) 배열 복사 방법
		//-for문 이용
		//-Arrays 클래스 이용
		//-System.arraycopy()메소드 이용
		//System.arraycopy(Object src<원본 배열 >, int srcPos<원본 배열 복사시작> , Object dest<새 배열>, int destPos<새 배열 붙여넣기 시작 인덱스>, int length<복사 항목수>);
		
		String [] oldStrArray = {"java" , "array" , "copy" };
		String [] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0 , oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i ++ ) {
			System.out.print(newStrArray[i]);
			if(i<newStrArray.length-1)
				System.out.print(", ");
		}
		System.out.println("\n");
		
		int myArray[] = {100, 200, 300, 400, 500};
		int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.println("<==myArray의 배열 값==>");
		for (int i = 0; i < myArray.length; i++ ) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		
		System.out.println("<==array의 배열값==>");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		
		System.out.println();
		System.arraycopy(myArray, 0 , array, 0 , myArray.length);
		
		System.out.println("<==arraycopy result==>");
		for (int j = 0; j < array.length; j ++) {
			System.out.print(array[j] + " ");
		}
	}

}
