fun f1 (double x) ret double {
    while (x <= 5) {
        //print(x);
        x = ++x;
    }

    return x;
}

for (i from 0 to 5) {
    print(++i);
}

//print(mx);
//print(f1(3));

print(%%f1(3));
print(f1(3)**2);

matrix mx1 = (
1 223.4,
323 4,
2 3
);

matrix mx2 = (
1 223.4,
323 4,
2 3
);

if (36.01 == f1(3)**2) print(1);
else print(2);

if (mx1 == mx2) print(1);
else print(2);