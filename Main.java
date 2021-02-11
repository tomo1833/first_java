class Main {

    public static void main(String[] args) {

        char[][] ary = {
            {'　', '　', '＊', '＊', '＊', '＊', '　', '　'},
            {'　', '＊', '　', '　', '　', '　', '＊', '　'},
            {'＊', '　', '　', '　', '　', '　', '　', '＊'},
            {'＊', '＊', '＊', '＊', '＊', '＊', '＊', '＊'},
            {'＊', '　', '　', '　', '　', '　', '　', '＊'},
            {'＊', '　', '　', '　', '　', '　', '　', '＊'},
            {'＊', '　', '　', '　', '　', '　', '　', '＊'},
            {'＊', '　', '　', '　', '　', '　', '＊', '＊'}
        };

        //　最初の出力
        printArray(ary);
    
        //　回転後の出力
        rotateSw(ary, 2);
    }

    /**
     * 2次元配列を表示するクラス
     * 
     * @param char[][] 出力する文字列
     * @return void
     */
    private  static void printArray(char[][] ary) {

        for(int i = 0; i < ary.length; i++){
            for(int j = 0; j < ary[0].length; j++){
                System.out.print(ary[i][j]);
            }
            System.out.print('\n');
        }
    }

    /**
     * 回転して出力する
     * 
     * @param char[][] 入力する文字列
     * @param int sw 1：そのまま表示/2：右回転/3：反転/４：左回転
     */
    private static void rotateSw(char [][] ary, int sw) {
        
        // 格納配列
        char[][] new_array = new char[ary.length][ary[0].length];

        int x = 0
        int y = 0;
        int[] result = new int[2];

        for(int i = 0; i < ary.length; i++){
            for(int j = 0; j < ary[0].length; j++){
                // 回転後の値設定
                result = rotateSwInt(i, j, sw);
                new_array[i][j] = ary[result[0]][result[1]];
            }
        }

        printArray(new_array);
    }

    /**
     * 2次元配列を表示するクラス
     * 
     * @param int i
     * @param int j
     * @param int sw 1：そのまま表示/2：右回転/3：反転/４：左回転
     * @return void
     */
    private static int[] rotateSwInt(int i, int j, int sw) {

        int[] result = new int[2];

        result[0] = i;
        result[0] = j;

        switch (sw) {
            case 1:
                result[0] = i;
                result[1] = j;
                break;
            case 2:
                result[0] = 7 - j;
                result[1] = i;
                break;
            case 3:
                result[0] = 7 - i;
                result[1] = 7 - j;
                break;
            case 4:
                result[0] = j;
                result[1] = 7 - i;
                break;
            default:
                break;
        }

        return result;
    }
    
}