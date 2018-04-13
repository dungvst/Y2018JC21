package VQChinh_iMic.non_generic_thuvien;

import java.util.Comparator;

public class SortByDuration implements Comparator<Video>{

	@Override
	public int compare(Video video1, Video video2) {
		return (int) (video1.getDuration() - video2.getDuration());
	}

}
