//hi
matrix mx1 = (
1 223.4,
323 4
);

matrix mx2 = (
1 2 3,
4 5 6,
7 8 9
);

matrix mx4 = get mx2 transpose;
print(mx4);

//vector v1 = (1 2);
//print(mx2 * v1);
//matrix mx3 = mx1 + mx2;
//print(mx3);
//print(mx3 == mx1 + mx2);
//print(mx1 + 4);
//print (mx1 - 1);

fun f1 (double x) ret void {
    while (x <= 5) {
        print(x);
        x = ++x;
    }
}

//f1(3);
//double e = -1.02;
//double d += ++4.7 + --56.12 + 15 + %%6**(1+1) + e;
//print(d);
//d = get mx1 determinant;