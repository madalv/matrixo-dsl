matrix m = (
            2 0 3,
            1 9 3,
            2 2 3.4);

//double d = %%6;

matrix n = (5 1.02 8,
            43.67 -9 -9,
            4 7 6);

//print(m * n);

matrix mx1 = (
1 223.4,
323 4
);

vector vec = import vector from C:\Users\Vlada\Downloads\pbl-sem-4\matrixoLang\src\tests\sheet1.xlsx;
vector v2 = vec * 2**3 + 1;
print(vec);
print(vec + (4 + 0.6));
print(vec - (4 + 0.6));
print(vec / %%4);
print(vec * v2); // dot product

print(v2);
print(vec - v2);


matrix a = ( 0 1,
            -1 -2);

matrix b = get a eigenvecs;
print(b);
print(get a eigenvals);

double d = get m determinant;
//print(d);

print(get m Q);
print(get m R);
matrix mm = get m Q * get m R;

print(get m L);
print(get m U);
matrix mV = get m L * get m U;
print(mV == m);

print(get m inverse);
print(minor(m, 1, 1));

matrix rr = (
1 2 3 9,
2 -1 1 8,
3 0 -1 3 );

print(get rr rref);

