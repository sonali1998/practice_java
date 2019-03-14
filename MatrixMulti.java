class MatrixMulti{



public static void main(String[] args)
{
 int[][]a ={{1,4,5},{2,4,5},{2,4,5}};
 int[][]b ={{3,6,8},{1,5,3},{7,3,2}};
 int[][]c=new int[3][3];


for(int i=0;i<3;i++)
{ for(int j=0;j<3;j++)
 {  for(int k=0;k<3;k++)
   {
     c[i][j] = c[i][j]+(a[i][k]*b[k][j]);
   }
  System.out.println("Element at"+i+j+" "+c[i][j]);
  
 }
}

}


}