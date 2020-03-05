class Hamming {

    short hammingDistance;
    
    Hamming(String leftStrand, String rightStrand) {

        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");

        } else if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {

            throw new IllegalArgumentException("right strand must not be empty.");

        } else if(leftStrand.length() != rightStrand.length()) {
            
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }
    }

    int getHammingDistance() {
        return hammingDistance;
    }
}
