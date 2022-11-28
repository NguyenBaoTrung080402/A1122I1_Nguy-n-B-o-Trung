package graph;

public class Pair <key extends Comparable<key>, value extends Comparable<value>> implements Comparable<Pair<key, value>>{

        public final key a;
        public final value b;

        public Pair(key a, value b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Pair<?, ?> pair = (Pair<?, ?>) o;
            if (!a.equals(pair.a)) {
                return false;
            }
            return b.equals(pair.b);
        }

        // Overriding so that objects in map
        // could find the object key
        @Override
        public int hashCode() {
            return 31 * a.hashCode() + b.hashCode();
        }

        @Override
        public String toString() {
            return "(" + a + ", " + b + ")";
        }

        @Override
        public int compareTo(Pair<key, value> o) {
            return getValue().compareTo(o.getValue());
        }

        public key getKey() {
            return a;
        }

        public value getValue() {
            return b;
        }
    }

