.00, 0.10, 0.14, 0.18, 0.20 };
        double customerDiscount;
        String strNumOrdered;
        int numOrdered;
        int sub = NUM_RANGES - 1;
        strNumOrdered = JOptionPane.showInputDialog(null,
                "How many items are ordered?");
        numOrdered = Integer.parseInt(strNumOrdered);
        while (sub >= 0 && numOrdered < discountRangeLimits[sub])
            --sub;