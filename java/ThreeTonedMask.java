package shader101;
public class ThreeTonedMask {
    public static UnpackedColor filterColor(
        UnpackedColor refColor,
        UnpackedColor subColor,
        UnpackedColor mediumColor,
        UnpackedColor supColor
        ) {
        UnpackedColor ret = new UnpackedColor();
        ret.A = filterChannel(
            refColor.A,
            subColor.A,
            mediumColor.A,
            supColor.A
            );
        ret.R = filterChannel(
            refColor.R,
            subColor.R,
            mediumColor.R,
            supColor.R
            );
        ret.G = filterChannel(
            refColor.G,
            subColor.G,
            mediumColor.G,
            supColor.G
            );
        ret.B = filterChannel(
            refColor.B,
            subColor.B,
            mediumColor.B,
            supColor.B
            );
        return ret;
        }
    public static float filterChannel(
        float refChannel,
        float subChannel,
        float mediumChannel,
        float supChannel
        ) {
        if (refChannel == 0.0f) return subChannel;
        if (refChannel == 0.5f) return mediumChannel;
        if (refChannel == 1.0f) return supChannel;
        if (refChannel < 0.5f) {
            return ((mediumChannel - subChannel) * (refChannel * 2.0f)) + subChannel;
            }
        else {
            return ((supChannel - mediumChannel) * ((refChannel - 0.5f) * 2.0f)) + mediumChannel;
            }
        }
    }
