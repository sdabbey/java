//Samuel Desmond Abbey Darko -- 3359322
public class ShopSales {
    public static void main(String[] args) {
        int [][] hs_branch = {
                {42000, 48000, 50000}, {52000, 58000, 60000}, 
                {46000, 49000, 58000}, {50000, 51000, 61000}
        };
        int [][] mall_branch = {
                {57000, 63000, 60000}, {70000, 67000, 73000}, 
                {67000, 65000, 62000}, {72000, 69000, 75000}
        };
        int hs_q1_total, hs_q2_total, hs_q3_total, hs_q4_total, 
            mall_q1_total, mall_q2_total, mall_q3_total, mall_q4_total,
            hs_annual_sale, mall_annual_sale, grand_annual_sale;
        
        int [] combined_q_sales = new int[4];
        int [][] m_combined_sales = new int [4][3];


        hs_q1_total = hs_q2_total = hs_q3_total = hs_q4_total = 0;
        mall_q1_total = mall_q2_total = mall_q3_total = mall_q4_total = 0;
        for (int q = 0; q < hs_branch[0].length; q++) {
            hs_q1_total += hs_branch[0][q]; 
            hs_q2_total += hs_branch[1][q];
            hs_q3_total += hs_branch[2][q];
            hs_q4_total += hs_branch[3][q];

            mall_q1_total += mall_branch[0][q]; 
            mall_q2_total += mall_branch[1][q];
            mall_q3_total += mall_branch[2][q];
            mall_q4_total += mall_branch[3][q];
        }
        
        //Assigning Total quarterly sales for each row
        combined_q_sales[0] = hs_q1_total + mall_q1_total;
        combined_q_sales[1] = hs_q2_total + mall_q2_total;
        combined_q_sales[2] = hs_q3_total + mall_q3_total;
        combined_q_sales[3] = hs_q4_total + mall_q4_total;


        hs_annual_sale = mall_annual_sale = grand_annual_sale = 0;
        for (int i = 0; i < m_combined_sales.length; i++) {
            for (int j = 0; j < m_combined_sales[i].length; j++) {
                m_combined_sales[i][j] = hs_branch[i][j] + mall_branch[i][j];
                hs_annual_sale += hs_branch[i][j];
                mall_annual_sale += mall_branch[i][j];
            }

           
            
        }
        grand_annual_sale = hs_annual_sale + mall_annual_sale;


        //Output Each Detail
        System.out.println("Shop Statistics:" + "\n");

  
        System.out.println("Monthly Combined Sales: " + "\n");
        for (int[] row : m_combined_sales) {
            for (int value : row) {
                System.out.print(value + "\t" + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Combined Quarterly Sales:");
        System.out.println("\n");
        for(int row : combined_q_sales){
            System.out.println(row);
        }

        System.out.println("\n");
        System.out.println("High Street Shop Annual Sales: ");
        System.out.println(hs_annual_sale);

        System.out.println("\n");
        System.out.println("Mall Shop Annual Sales: ");
        System.out.println(mall_annual_sale);

        System.out.println("\n");
        System.out.println("Grand Annual Sale: ");
        System.out.println(grand_annual_sale);

    }
}
