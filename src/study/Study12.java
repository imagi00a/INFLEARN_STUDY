package study;

public class Study12 {


	    public static void main(String[] args) {
	    	//배열 arr을 초기화
	        int[] arr = {30, 60, 12, 54, 2, 45};
	        //quickSort 메소드를 호출하여 배열 전체를 정렬
	        quickSort(arr, 0, arr.length - 1);
	        //정렬된 배열을 출력
	        System.out.println("Sorted array: ");
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	    }

	    
	    //quickSort 메소드는 재귀적으로 배열을 정렬합니다.
	    //l과 h는 배열의 처음과 끝 인덱스를 나타냅니다.
	    private static void quickSort(int[] arr, int l, int h) {
	        if (l < h) {
	            // 파티션 인덱스 찾기
	        	//patition 메소드를 호출하여 배열을 두 부분으로 나눕니다.
	        	//이 메소드는 새로 정렬된 피벗의 인덱스를 반환합니다.
	            int part = partition(arr, l, h);

	            //반환된 인덱스를 기준으로 하여 배열 두 부분을 나눠 각 부분을 재귀적으로 정렬합니다.
	            quickSort(arr, l, part - 1);
	            quickSort(arr, part + 1, h);
	        }
	    }

	    
	    //partition 메소드는 배열을 피벗을 중심으로 양쪽으로 나눕니다.
	    private static int partition(int[] arr, int l, int h) {
	        // 피벗을 오른쪽 요소로 설정
	        int pivot = arr[h]; 
	        int i = (l - 1); // 작은 요소 인덱스

	        for (int j = l; j < h; j++) {
	            // 현재 요소가 피벗보다 작거나 같은 경우
	            if (arr[j] <= pivot) {
	                i++;

	                // arr[i]와 arr[j] 교환
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // arr[i+1]과 arr[h] 교환
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[h];
	        arr[h] = temp;

	        return i + 1;
	    }
	}
