import java.util.Scanner;

public class Return_Shipping_Fee {
    public static void main(String[] args) {

//        idea: 50,000원 미만 구매시 배송비 3,000원
//              부분 반품 시 청구해야 할 배송비는 반품 배송비 3,000원
//              받아야 할 금액 : 3,000원
//
//              50,000원 이상 구매시 배송비 무료
//              부분 반품 시   1. (구매 총액)-(반품하려는 제품 가격) < 50,000원
//                               구매 총액이 50,000원 미만이 되는 것이므로 [초기배송비 + 반품배송비] 받아야 함
//                               받아야 할 금액 : 3,000원 + 3,000원 = 6,000원
//
//                           2. (구매 총액)-(반품하려는 제품 가격) ≥ 50,000원
//                               구매 총액은 50,000원 이상이므로 반품배송비만 받아야 함
//                               받아야 할 금액 : 3,000원

        Scanner scanner = new Scanner(System.in);
        System.out.println("금액 입력 시 숫자만 입력해 주시기 바랍니다.");

        System.out.println("고객님께서 초기에 주문하신 금액 = ");
        int a = scanner.nextInt();

        System.out.println("고객님께서 반품하려는 제품의 금액 = ");
        int b = scanner.nextInt();

        if(a<50000) {
            System.out.println("청구해야 할 금액은 반품배송비 3,000원 입니다.");
        }
        if(a>=50000) {
            if(a-b<50000) {
                System.out.println("청구해야 할 금액은 초기배송비 + 반품배송비 = 6,000원 입니다.");
            }
            else {
                 System.out.println("청구해야 할 금액은 반품배송비 3,000원 입니다.");
            }

        }

    }
}
