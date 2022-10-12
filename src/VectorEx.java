import java.util.Vector;
public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        /* 여러 객체들을 삽입, 삭제, 검색하는 컨테이너 클래스*/
        /*Vector<Integer> 컬렉션0~6*/
        /*add()이용 요소를 삽입 get()을 이용 요소를 검색*/
        v.add(5);//0에 5 삽입
        v.add(4);//1에 4 삽입
        v.add(-1);//2에 -1 삽입
        v.add(2, 100);//2에 삽입하고 원래 2에있던 -1 일 3으로 감
        System.out.println("벡터 내의 요소 객체 수 : " + v.size());//요소 개수
        System.out.println("벡터의 현재 용량 : " + v.capacity());//벡터의 용량
        for(int i=0; i<v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        } //모든 정수 요소 출력하기
        int sum = 0;
        for(int i=0; i<v.size(); i++) {
            int n = v.elementAt(i); //i번째 벡터값 요소를 확인합니다.
            sum += n;
        } //벡터속의 모든 정수 더하기
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
