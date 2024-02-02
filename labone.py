
def parallel(resistors):
    if len(resistors) < 2:
        return "At least 2 resistors are required for parallel connection"
    else:
        total_inverse = sum(1 / r for r in resistors)
        equivalent_resistance = 1 / total_inverse
        return f"{equivalent_resistance:.3f} ohms"


def potential_divider(vin, Rvals):
    RT = sum(Rvals)
    vol_drops = [vin * (r / RT) for r in Rvals]
    print(vol_drops,"v")
    return 


def temperature_check(temp, unit):
    if unit.lower() == 'c':
        if temp < 36.5:
            return "The patient is hypothermic"
        elif temp > 37.5:
            return "The patient is hyperthermic"
        else:
            return "The patient has a normal body temperature"
    elif unit.lower() == 'f':
        temp_celsius = (temp - 32) * 5/9
        if temp_celsius < 36.5:
            return "The patient is hypothermic"
        elif temp_celsius > 37.5:
            return "The patient is hyperthermic"
        else:
            return "The patient has a normal body temperature"
    else:
        return "Please provide a valid unit (C for Celsius, F for Fahrenheit)"



