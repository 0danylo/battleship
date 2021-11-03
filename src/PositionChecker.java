public class PositionChecker {
	public Position checkPosition(String inputPos) {
		char[] chars = inputPos.toUpperCase().toCharArray();
		if (chars.length>2 && chars[0]>='A' && chars[0]<='J' && chars[1]=='-') {
			if (chars.length==3 && chars[2]>='1' && chars[2]<='9')
				return new Position(chars[0], chars[2]-48);
			else if (chars.length==4 && inputPos.substring(2).equals("10"))
				return new Position(chars[0], 10);
		}
		return new Position(-1,-1);
	}
}