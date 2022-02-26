import java.util.Scanner;


public class Return_Shipping_Fee {
    public static final String FONT_BLUE = "\u001B[34m";
    public static final String FONT_BLACK = "\u001B[30m";
    public static final String FONT_RED = "\u001B[31m";
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

        System.out.println("\n\n부분 반품 접수 시 고객님께 청구해야 할 배송비를 계산하는 프로그램입니다.\n"+FONT_RED+"금액 입력 시 숫자만 입력해 주시기 바랍니다."+FONT_BLACK);

        while(true) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n고객님께서 처음에 주문하신 금액 = ");
        int a = scanner.nextInt();
        System.out.println(a+"원\n");

        if(a<50000) {
            System.out.println("청구해야 할 금액은 "+FONT_BLUE +"반품배송비 3,000원 입니다.\n"+ FONT_BLACK);
            System.out.println("\n\n새로운 금액을 입력해 주시기 바랍니다.");
            continue;
        }


        System.out.println("고객님께서 반품하려는 제품의 금액 = ");
        int b = scanner.nextInt();
        System.out.println(b+"원\n");

        if(a<b) {
            System.out.printf(FONT_RED+"반품 금액이 주문 금액을 넘을 수 없습니다."+FONT_BLACK+"\n\n다시 입력해 주시기 바랍니다.\n\n\n");
            continue;
        }

        if(a>=50000) {
            if (a - b < 50000) {
                System.out.println("총 주문 금액은 "+(a-b)+"원으로 50,000원 무료배송에 해당하지 않습니다.\n청구해야 할 금액은 "+FONT_BLUE +"초기배송비 + 반품배송비 = 6,000원 입니다.\n"+ FONT_BLACK);
            } else {
                System.out.println("총 주문 금액은 "+(a-b)+"원으로 50,000원 무료배송에 해당합니다.\n청구해야 할 금액은 "+FONT_BLUE +"반품배송비 3,000원 입니다.\n"+ FONT_BLACK);
            }

        }
        System.out.println("\n\n새로운 금액을 입력해 주시기 바랍니다.");
        continue;
        }



    }
}
