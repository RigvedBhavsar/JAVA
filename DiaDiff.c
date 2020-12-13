//Diagonal Differnece
#include<stdio.h>
#include<malloc.h>

int DiffDiagonal(int **arr, int iRows , int iCols)
{
    int i=0,j=0;
    int DSum=0, NDSum=0;

    for(i=0;i<iRows;i++)
    {
        for(j=0;j<iCols;j++)
        {
            if(i==j)
            {
                DSum=DSum+arr[i][j];
            }
            else if ((i+j) == (iRows-1))
            {
                NDSum=NDSum+arr[i][j];
            }
        }
    }
    printf("%d \t %d",DSum,NDSum);

    return DSum - NDSum;
}

int main()
{
    int i=0,j=0;
    int **p=NULL;
    int Row=0, Col=0;
    int Diff=0;

    printf("Enter the Number of rows");
    scanf("%d",&Row);

    printf("Enter the Number of cols");
    scanf("%d",&Col);
    
    p=(int**) malloc(Row * sizeof(int*));
    for(i=0;i<Row;i++)
    {
        p[i]=(int*) malloc(Col*sizeof(int));
    }

    printf("Enter the Elements of the 2-D Array");

    for(i=0;i<Row;i++)
    {
        for(j=0;j<Col;j++)
        {
            scanf("%d",&p[i][j]);
        }
    }
    printf("2-D matrix is :\n");

    for(i=0;i<Row;i++)
    {
        for(j=0;j<Col;j++)
        {
            printf("%d\t",p[i][j]);
        }
        printf("\n");
    }
    Diff=DiffDiagonal(p,Row,Col);
    printf("Difference is %d",Diff);

    return 0;
}