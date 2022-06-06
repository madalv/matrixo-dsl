vector v = (1 2 3.234);

matrix m1 = import matrix from C:\Users\Vlada\Downloads\pbl-sem-4\matrixoLang\src\tests\ad.csv;
vector v1 = import vector from C:\Users\Vlada\Downloads\pbl-sem-4\matrixoLang\src\tests\advec.csv;
double d = get m1 rowsize + get m1 colsize + 1;
print(d);

print(m1, v1);
print(get m1 transpose);

matrix m2 = import matrix from C:\Users\Vlada\Downloads\pbl-sem-4\matrixoLang\src\tests\sheet1.xlsx;
print(m2);

for (i from 0 to 5) {
    print(m2 + i);
}