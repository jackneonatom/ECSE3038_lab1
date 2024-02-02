
def parallel(resistors):
    if len(resistors) < 2:
        return "silly silly thatss not parallel"
    else:
        total_inverse = sum(1 / r for r in resistors)
        equivalent_resistance = 1 / total_inverse
        return f"{equivalent_resistance} ohms"


def potential_divider(vin, Rvals):
    RT = sum(Rvals)
    vol_drops = [vin * (r / RT) for r in Rvals]
    # print(vol_drops,"v")
    return f"{vol_drop} v"



def temperature_check(temp, type):
    if type.lower() == 'c':
        if temp < 36.5:
            return "The patient is hypothermic"
        elif temp > 37.5:
            return "The patient is hyperthermic"
        else:
            return "The patient has a normal body temperature"
    elif type.lower() == 'f':
        temp_celsius = (temp - 32) * 5/9
        if temp_celsius < 36.5:
            return "The patient is hypothermic"
        elif temp_celsius > 37.5:
            return "The patient is hyperthermic"
        else:
            return "The patient has a normal body temperature"
    else:
        return "silly silly, thats not righttt"



