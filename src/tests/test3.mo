fun f1 (double x) ret double {
    while (x <= 5) {
        //print(x);
        x = ++x;
    }

    return x;
}

for (i from 0 to 5) {
    print(i);
}
//print(mx);
print(f1(3));