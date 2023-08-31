package ch05.sec04;
/**
 * 원본배열이 oldStrArray이고, 새 배열이 newStrArray일 경우 
 * 새 배여로 원본 배열 모두 복사
 */
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		// 배열 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (String string : newStrArray) {
			System.out.println(string);
		}
	}

}
