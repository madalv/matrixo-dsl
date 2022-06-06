matrix m = (
            2 1 -1,
            -3 -1 2,
            -2 1 2
            );

vector v = (8 -11 -3);
vector solution = gauss(m, v);
print(solution);