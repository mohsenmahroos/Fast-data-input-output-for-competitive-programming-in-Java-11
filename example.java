public static void main(String[] args) throws IOException {
        final var cin  = new BufferedReader(new InputStreamReader(System.in));
        final var cout = new BufferedOutputStream(System.out);
        final var input = nextLine(cin);
        final var n = input.nextInt();
        final var r = input.nextInt();
        cout.write(to_bytes("%.7f",r/(1.0/Math.sin(Math.PI/n)-1.0)));
        cout.flush(); }
