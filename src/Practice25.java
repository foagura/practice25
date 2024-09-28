/* アクセス修飾子の練習 */

class Employee {
    private int id;    // privateを付けている為、同一クラスからのみ呼び出せる

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class Practice25 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(100);
        System.out.println("社員ID：" + emp.getId());

        // 下記の記述だと、private付き変数を直接呼び出そうとしている為コンパイルエラーとなる
        // System.out.println("private付き変数を直接呼び出すと：" + emp.id);
    }
}
