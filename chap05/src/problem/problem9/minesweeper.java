package problem.problem9;

public class minesweeper {
	public static void main(String[] args) {
		if (args.length == 3) {
			int m = Integer.parseInt(args[0]);
			int n = Integer.parseInt(args[1]);
			double p = Double.parseDouble(args[2]);

			String[][] map = new String[m][n];


			// 지뢰 매설
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = Math.random() <= p ? "*" : "-";
				}
			}

			// 지뢰만 출력
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println();

			// 주변 지뢰 갯수와 지뢰를 함께 출력
			for (int cRow = 0; cRow < m; cRow++) {
				for (int cCol = 0; cCol < n; cCol++) {
					String result;

					if (map[cRow][cCol].equals("*")) {
						result = map[cRow][cCol];
					} else {
						int count = 0;
						for (int tRow = cRow-1; tRow <= cRow+1; tRow++) { // 비교를 위해 현재 행의 -1부터 +1까지 순회
							for (int tCol = cCol-1; tCol <= cCol+1; tCol++) { // 비교를 위해
								if (
										tRow >= 0 && tRow < m && // tRow(행)가 맵의 범위를 벗어나지 않아야 함
										tCol >= 0 && tCol < n // tCol(열)이 맵의 범위를 벗어나지 않아야 함
								) {
									if (map[tRow][tCol].equals("*")) { // tCol에 지뢰가 있으면
										count++; // count 증가
									}
								}
							}
						}
						result = count + "";
					}
					System.out.print(result + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("어이쿠!");
		}
	}
}